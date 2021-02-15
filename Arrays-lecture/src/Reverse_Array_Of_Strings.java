import java.util.Scanner;

public class Reverse_Array_Of_Strings {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String[] text = term.nextLine().split(" ");

        for (int i = 0; i < text.length / 2; i++) {
            String reversed = text[i];
            text[i] = text[text.length - (i + 1)];
            text[text.length - (i + 1)] = reversed;
        }
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }
    }
}
