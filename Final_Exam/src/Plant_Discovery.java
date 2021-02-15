import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Plant_Discovery {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();
        Map<String, Integer> plantsRarity = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] plant = term.nextLine().split("<->");
            String name = plant[0];
            int rarity = Integer.parseInt(plant[1]);

            plantsRating.putIfAbsent(name, new ArrayList<>());
            plantsRarity.putIfAbsent(name, 0);
            if (plantsRarity.containsKey(name)){
                plantsRarity.put(name,rarity);
            }
        }

        String input = term.nextLine();
        //String regex = "(?<command>[A-Z]\\w+):.?(?<plantType>[A-Z]\\w+).?-?.?(?<value>\\d+)";
        //Pattern pattern = Pattern.compile(regex);
        //Matcher matcher = pattern.matcher(input);

        while (!"Exhibition".equals(input)){
            String[] parts = (input.split(": "));
            String command = parts[0];
            String[] tokens = parts[1].split(" - ");
            switch (command){
                case "Rate":
                    String plant = tokens[0];
                    double rating = Double.parseDouble(tokens[1]);
                    plantsRating.get(plant).add(rating);

                    break;
                case "Update":
                    String plantType = tokens[0];
                    int rarity = Integer.parseInt(tokens[1]);
                    if (plantsRarity.containsKey(plantType)){
                        plantsRarity.put(plantType, rarity);
                    }
                    break;
                case "Reset":
                    String plantT = tokens[0];
                    if (plantsRating.containsKey(plantT)){
                        int length = plantsRating.get(plantT).size();

                    }
                    break;
            }

            input = term.next();
        }
        System.out.println(plantsRating.toString());
    }
}
