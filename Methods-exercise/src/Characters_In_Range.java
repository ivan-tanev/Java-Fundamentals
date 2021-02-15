import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Characters_In_Range {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        char first = term.nextLine().charAt(0);
        char second = term.nextLine().charAt(0);

        if (first < second) {
            printSymbolsInRange(first, second);
        } else {
            printSymbolsInRange(second, first);
        }
    }

    private static void printSymbolsInRange(char first, char second) {
        for (int i = first + 1; i < second; i++) {
            System.out.printf("%c ", i);
        }
    }
}
