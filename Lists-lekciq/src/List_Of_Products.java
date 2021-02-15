import java.util.*;

public class List_Of_Products {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = term.nextLine();
            products.add(input);
        }

        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, products.get(i));
        }
    }
}
