import java.util.Scanner;

public class Repeat_String {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();
        int n = Integer.parseInt(term.nextLine());

        String newString = repeat(input, n);
        System.out.println(newString);
    }

    private static String repeat(String input, int n) {
        String repeated = "";
        for (int i = 0; i < n; i++) {
            repeated = repeated + input;
        }
        return repeated;
    }
}
