import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String product = term.nextLine();
        int quantity = Integer.parseInt(term.nextLine());

        switch (product){
            case "coffee":
                priceForCoffee(quantity);
                break;
            case "water":
                priceForWater(quantity);
                break;
            case "coke":
                priceForCoke(quantity);
                break;
            case "snacks":
                priceForSnacks(quantity);
                break;
        }
    }

    private static void priceForSnacks(int quantity) {
        double sum = quantity * 2.00;
        System.out.printf("%.2f", sum);
    }

    private static void priceForCoke(int quantity) {
        double sum = quantity * 1.40;
        System.out.printf("%.2f", sum);
    }

    private static void priceForWater(int quantity) {
        double sum = quantity * 1.00;
        System.out.printf("%.2f", sum);
    }

    private static void priceForCoffee(int quantity) {
        double sum = quantity * 1.50;
        System.out.printf("%.2f", sum);
    }
}
