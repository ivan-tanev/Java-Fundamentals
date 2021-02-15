import java.util.Scanner;

public class Reversed_Chars {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        char first = term.nextLine().charAt(0);
        char second = term.nextLine().charAt(0);
        char third = term.nextLine().charAt(0);

        System.out.printf("%c %c %c", third, second, first);
    }
}
