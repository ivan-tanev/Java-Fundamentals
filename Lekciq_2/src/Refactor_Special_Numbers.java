import java.util.Scanner;

public class Refactor_Special_Numbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());

        boolean specialNumber = false;
        for (int count = 1; count <= n; count++) {
            int sum = 0;
            int number = count;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n", count);
            } else {
                System.out.printf("%d -> False%n", count);
            }
        }
    }
}
