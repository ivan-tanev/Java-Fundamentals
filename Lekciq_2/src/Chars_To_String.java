import java.util.Scanner;

public class Chars_To_String {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        char first = term.nextLine().charAt(0);
        char second = term.nextLine().charAt(0);
        char third = term.nextLine().charAt(0);

        String numbers = Character.toString(first) + Character.toString(second) + Character.toString(third);
        System.out.println(numbers);
    }
}
