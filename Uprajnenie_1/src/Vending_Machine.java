import java.util.Scanner;

public class Vending_Machine {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String input = term.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            if (Double.parseDouble(input) == 0.1 ||
                Double.parseDouble(input) == 0.2 ||
                Double.parseDouble(input) == 0.5 ||
                Double.parseDouble(input) == 1 ||
                Double.parseDouble(input) == 2) {
                sum = sum + Double.parseDouble(input);
                input = term.nextLine();
            } else {
                System.out.printf("Cannot accept %.2f%n", Double.parseDouble(input));
                input = term.nextLine();
            }
        }
        input = term.nextLine();

        while (!input.equals("End")) {
            if (input.equals("Nuts")){
                if (sum >= 2.0){
                    sum = sum - 2.0;
                    System.out.println("Purchased Nuts");
                    input = term.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = term.nextLine();
                }
            } else if (input.equals("Water")){
                if (sum >= 0.7){
                    sum = sum - 0.7;
                    System.out.println("Purchased Water");
                    input = term.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = term.nextLine();
                }
            } else if (input.equals("Crisps")){
                if (sum >= 1.5){
                    sum = sum - 1.5;
                    System.out.println("Purchased Crisps");
                    input = term.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = term.nextLine();
                }
            } else if (input.equals("Soda")){
                if (sum >= 0.8){
                    sum = sum - 0.8;
                    System.out.println("Purchased Soda");
                    input = term.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = term.nextLine();
                }
            } else if (input.equals("Coke")){
                if (sum >= 1.0){
                    sum = sum - 1.0;
                    System.out.println("Purchased Coke");
                    input = term.nextLine();
                } else {
                    System.out.println("Sorry, not enough money");
                    input = term.nextLine();
                }
            } else {
                System.out.println("Invalid product");
                input = term.nextLine();
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}
