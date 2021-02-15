import java.util.*;

public class Company_Users {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        Map<String, List<String>> companies = new LinkedHashMap<>();

        String input = term.nextLine();

        while(!"End".equals(input)){
            String[] tokens = input.split(" -> ");
            String companyName = tokens[0];
            String id = tokens[1];

            companies.putIfAbsent(companyName, new ArrayList<>());
            if (companies.get(companyName).contains(id)){

            } else {
                companies.get(companyName).add(id);
            }

            input = term.nextLine();
        }

        companies
                .entrySet()
                .stream()
                .sorted((c1 ,c2) -> c1.getKey().compareTo(c2.getKey()))
                .forEach(c -> {
                    System.out.println(c.getKey());
                    c.getValue().forEach((s) -> System.out.println(String.format("-- %s", s)));
                });
    }
}
