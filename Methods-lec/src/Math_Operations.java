import java.util.Scanner;

public class Math_Operations {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int num1 = Integer.parseInt(term.nextLine());
        char operator = term.nextLine().charAt(0);
        int num2 = Integer.parseInt(term.nextLine());

        switch (operator){
            case '+':
                calculation1(num1, num2);
                break;
            case '-':
                calculation2(num1, num2);
                break;
            case '*':
                calculation3(num1, num2);
                break;
            case '/':
                calculation4(num1, num2);
                break;
        }
    }

    private static void calculation1(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void calculation2(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void calculation3(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void calculation4(int num1, int num2) {
        System.out.println(num1 / num2);
    }
}
