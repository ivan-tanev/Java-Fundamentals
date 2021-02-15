import java.math.BigInteger;
import java.util.Scanner;

public class Sum_Big_Numbers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        BigInteger first = new BigInteger(term.nextLine());
        BigInteger second = new BigInteger(term.nextLine());

        BigInteger sum = first.add(second);

        System.out.println(sum);
    }
}
