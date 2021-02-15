import java.util.Scanner;

public class Factorial_Division {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int first = Integer.parseInt(term.nextLine());
        int second = Integer.parseInt(term.nextLine());

        double fistFac = factorial1(first);
        double secondFac = factorial2(second);
        double result = divideOFFac(fistFac, secondFac);
        System.out.printf("%.2f", result);
    }

    private static double divideOFFac(double fistFac, double secondFac) {
        double result = 0;
        result = fistFac / secondFac;
        return result;
    }

    private static double factorial2(int second) {
        double factorial = 1;
        for (int i = second; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    private static double factorial1(int first) {
        double factorial = 1;
        for (int i = first; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
