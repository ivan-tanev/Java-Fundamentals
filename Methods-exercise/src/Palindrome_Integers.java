import java.util.Scanner;

public class Palindrome_Integers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        while (!input.equals("END")){
            int[] numbers = new int[input.length()];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
            }
            int[] palindrome = new int[numbers.length];
            for (int i = 0; i < palindrome.length; i++) {
                palindrome[i] = numbers[numbers.length - i - 1];
            }

            boolean isPalindrome = false;
            for (int i = 0; i < palindrome.length; i++) {
                if (palindrome[i] == numbers[i]){
                    isPalindrome = true;
                } else {
                    isPalindrome = false;
                }
            }
            if (isPalindrome){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = term.nextLine();
        }
    }
}
