import java.util.Scanner;

public class Convert_Meters_To_Kilometers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int meters = Integer.parseInt(term.nextLine());
        double kilometers = meters / 1000.0;
        System.out.printf("%.2f", kilometers);
    }
}
