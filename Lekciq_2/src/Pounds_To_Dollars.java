import java.math.BigDecimal;
import java.util.Scanner;

public class Pounds_To_Dollars {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        double input = Double.parseDouble(term.nextLine());

        double converter = input * 1.31;
        System.out.printf("%.3f", converter);
    }
}
