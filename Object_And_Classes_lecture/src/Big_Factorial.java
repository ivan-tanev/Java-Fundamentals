import java.math.BigInteger;
import java.util.Scanner;

public class Big_Factorial {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());

        BigInteger factorial = new BigInteger("1");

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
