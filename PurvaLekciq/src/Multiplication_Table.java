import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int number = Integer.parseInt(term.nextLine());
        for (int i = 1; i <= 10; i++) {
            int sum = number * i;
            System.out.printf("%d X %d = %d%n", number, i, sum);
        }
    }
}
