import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String command = term.nextLine();
        int num1 = Integer.parseInt(term.nextLine());
        int num2 = Integer.parseInt(term.nextLine());

        switch (command){
            case "add":
                add(num1, num2);
                break;
            case"multiply":
                multiply(num1, num2);
                break;
            case "subtract":
                subtract(num1, num2);
                break;
            case "divide":
                divide(num1, num2);
                break;
        }
    }

    private static void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    private static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void multiply(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
