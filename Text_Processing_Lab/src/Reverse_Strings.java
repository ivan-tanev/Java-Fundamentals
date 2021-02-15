import java.util.Scanner;

public class Reverse_Strings {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        while (!"end".equals(input)){
            String word = new StringBuilder(input).reverse().toString();
            System.out.println(String.format("%s = %s", input, word));

            input = term.nextLine();
        }
    }
}
