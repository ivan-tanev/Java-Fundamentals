import java.util.Scanner;

public class Calculate_Rectangle_Area {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        double width = Integer.parseInt(term.nextLine());
        double length = Integer.parseInt(term.nextLine());

        double area = 0;
        area = area(width, length);
        System.out.printf("%.0f", area);
    }

    private static double area(double width, double length) {
        double area = width * length;
        return area;
    }
}
