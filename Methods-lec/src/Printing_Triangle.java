import java.util.Scanner;

public class Printing_Triangle {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int number = Integer.parseInt(term.nextLine());

        for (int i = 1; i <= number; i++) {
            printTriangles(1, i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printTriangles(1, i);
        }
    }

    private static void printTriangles(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
