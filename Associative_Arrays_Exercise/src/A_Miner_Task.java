import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A_Miner_Task {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        Map<String, Integer> items = new LinkedHashMap<>();

        while (!"stop".equals(input)){
            int quantity = Integer.parseInt(term.nextLine());
            items.putIfAbsent(input, 0);
            int newQuantity = items.get(input) + quantity;
            items.put(input, newQuantity);

            input = term.nextLine();
        }
        items
                .forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
    }
}
