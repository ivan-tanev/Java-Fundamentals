import java.util.Scanner;

public class Multiplication_Table_2 {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int number = Integer.parseInt(term.nextLine());
        int secondNumber = Integer.parseInt(term.nextLine());

        if (secondNumber <= 10) {
            for (int i = secondNumber; i <= 10; i++) {
                int sum = number * i;
                System.out.printf("%d X %d = %d%n", number, i, sum);
            }
        } else {
            int sum2 = number * secondNumber;
            System.out.printf("%d X %d = %d", number, secondNumber, sum2);
        }
    }
}
