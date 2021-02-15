import java.util.*;

public class Pirates_03 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        Map<String, Integer> cityAndCitizens = new LinkedHashMap<>();
        Map<String, Integer> cityAndGold = new LinkedHashMap<>();

        String input = term.nextLine();
        while (!"Sail".equals(input)){
            String[] parts = input.split("\\|\\|");
            String city = parts[0];
            int population = Integer.parseInt(parts[1]);
            int gold = Integer.parseInt(parts[2]);

            cityAndCitizens.putIfAbsent(city, 0);
            int current1 = cityAndCitizens.get(city);
            cityAndCitizens.put(city, current1 + population);

            cityAndGold.putIfAbsent(city, 0);
            int current2 = cityAndGold.get(city);
            cityAndGold.put(city,current2 + gold);

            input = term.nextLine();
        }

        input = term.nextLine();

        while (!"End".equals(input)){
            String[] parts = input.split("=>");
            String command = parts[0];
            String city = parts[1];

            switch (command){
                case "Plunder":
                    int people = Integer.parseInt(parts[2]);
                    int gold = Integer.parseInt(parts[3]);

                    int currentPeople = cityAndCitizens.get(city) - people;
                    int currentGold = cityAndGold.get(city) - gold;

                    cityAndCitizens.put(city,currentPeople);
                    cityAndGold.put(city,currentGold);

                    System.out.println(String.format("%s plundered! %d gold stolen, %d citizens killed.", city, gold, people));

                    if (currentPeople <= 0){
                        System.out.println(String.format("%s has been wiped off the map!", city));
                        cityAndCitizens.remove(city);
                        cityAndGold.remove(city);
                    } else if (currentGold <= 0){
                        System.out.println(String.format("%s has been wiped off the map!", city));
                        cityAndCitizens.remove(city);
                        cityAndGold.remove(city);
                    }
                    break;
                case "Prosper":
                    gold = Integer.parseInt(parts[2]);

                    if (gold < 0){
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        currentGold = cityAndGold.get(city) + gold;
                        cityAndGold.put(city, currentGold);
                        System.out.println(String.format("%d gold added to the city treasury. %s now has %d gold.", gold, city, cityAndGold.get(city)));
                    }
                    break;
            }

            input = term.nextLine();
        }
        if (cityAndCitizens.isEmpty() && cityAndGold.isEmpty()){
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        } else {
            System.out.println(String.format("Ahoy, Captain! There are %d wealthy settlements to go to:", cityAndCitizens.size()));
            cityAndGold
                    .entrySet()
                    .stream()
                    .sorted((a, b) -> {
                        if (b.getValue() > a.getValue()){
                            return 1;
                        } else if (b.getValue() < a.getValue()) {
                            return -1;
                        } else {
                            int so = a.getKey().compareTo(b.getKey());
                            return so;
                        }
                    })
                    .forEach(city -> System.out.println(String.format("%s -> Population: %d citizens, Gold: %d kg", city.getKey(), cityAndCitizens.get(city.getKey()), city.getValue())));
        }
    }
}
