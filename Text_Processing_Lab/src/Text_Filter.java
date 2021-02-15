import java.util.Scanner;

public class Text_Filter {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] banWords = term.nextLine().split(", ");
        StringBuilder text = new StringBuilder(term.nextLine());
        String result = "";

        for (int i = 0; i < banWords.length; i++) {
            while (text.toString().contains(banWords[i])){
                result = text.toString().replace(banWords[i], asterisks(banWords[i]));
                text.delete(0, text.length());
                text.append(result);
            }
        }

        System.out.println(text);
    }

    private static String asterisks(String word) {
        int count = word.length();
        String replaced = word;
        for (int i = 0; i < count; i++) {
            replaced = word.replace(word.charAt(i), '*').toString();
            word = replaced;
        }
        return replaced;
    }
}
