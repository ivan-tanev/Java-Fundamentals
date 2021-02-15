import java.util.Scanner;

public class Repeat_Strings {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : input) {
            int count = word.length();
            for (int i = 0; i < count; i++) {
                result.append(word);
            }
        }
        System.out.println(result);
    }
}
