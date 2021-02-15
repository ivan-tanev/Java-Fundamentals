import java.math.BigDecimal;
import java.util.Scanner;

public class Exact_Sum_Of_Real_Numbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
            BigDecimal number = new BigDecimal(term.nextLine());
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
