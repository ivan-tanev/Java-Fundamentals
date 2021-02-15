import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String word = term.nextLine();
        String input = term.nextLine();
        String replaced = "";

        while (input.contains(word)){
            if (input.contains(word)){
                int startIndex = input.indexOf(word);
                int stopIndex = input.lastIndexOf(word + 1);

                replaced = input.replace(word, "");
                input = replaced;
            }
            input = replaced;
        }
        System.out.println(input);
    }
}
