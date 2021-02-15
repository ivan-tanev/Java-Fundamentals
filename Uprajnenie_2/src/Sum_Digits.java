import java.util.Arrays;
import java.util.Scanner;

public class Sum_Digits {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String digit = term.nextLine();
        int sum = 0;

        for (int i = 0; i < digit.length(); i++) {
            char symbol = digit.charAt(i);
            sum = sum + Character.getNumericValue(symbol);
        }
        System.out.println(sum);
    }
}
