import java.util.*;

public class Orders {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split("\\s+");

        Map<String, Double> products = new LinkedHashMap<>();
        Map<String, Double> quantity = new LinkedHashMap<>();

        while (!"buy".equals(input[0])){
            double priceOf = Double.parseDouble(input[1]);
            double quantitys = Double.parseDouble(input[2]);

            products.putIfAbsent(input[0], 0.0);
            quantity.putIfAbsent(input[0], 0.0);
            double totalQuantity = quantity.get(input[0]) + quantitys;
            quantity.put(input[0], totalQuantity);

            if (products.get(input[0]) == 0) {

                products.put(input[0], priceOf * quantitys);
            } else {
                products.put(input[0], (quantity.get(input[0]) * priceOf));
            }

            input = term.nextLine().split("\\s+");
        }
        products
                .forEach((k, v) -> System.out.println(String.format("%s -> %.2f", k, v)));
    }
}
