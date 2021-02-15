import java.util.Scanner;

public class Refactor_Volume_Of_Pyramid {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        double length = Double.parseDouble(term.nextLine());
        double width = Double.parseDouble(term.nextLine());
        double height = Double.parseDouble(term.nextLine());
        double Volume = (length * width * height) / 3;

        System.out.print("Length: ");
        System.out.print("Width: ");
        System.out.print("Height: ");
        System.out.printf("Pyramid Volume: %.2f", Volume);
    }
}
