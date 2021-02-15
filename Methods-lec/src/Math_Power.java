import java.text.DecimalFormat;
import java.util.Scanner;

public class Math_Power {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        double number = Double.parseDouble(term.nextLine());
        int degree = Integer.parseInt(term.nextLine());

        double result = raised(number, degree);
        System.out.println(new DecimalFormat("0.####").format(raised(number, degree)));
    }

    private static double raised(double number, int degree) {
        double sum = 1;
        for (int i = 0; i < degree; i++) {
            sum = sum * number;
        }
        return sum;
    }
}
