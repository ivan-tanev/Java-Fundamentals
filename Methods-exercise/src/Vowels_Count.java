import java.util.Scanner;

public class Vowels_Count {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        printTheCountOfVowels(input);
    }

    private static void printTheCountOfVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a'|| input.charAt(i) == 'e'|| input.charAt(i) == 'i'||
                    input.charAt(i) == 'o'|| input.charAt(i) == 'u'){
                count++;
            }
            if (input.charAt(i) == 'A'|| input.charAt(i) == 'E'|| input.charAt(i) == 'I'||
                    input.charAt(i) == 'O'|| input.charAt(i) == 'U'){
                count++;
            }
        }
        System.out.println(count);
    }
}
