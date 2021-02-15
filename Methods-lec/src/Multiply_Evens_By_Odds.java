import java.util.Scanner;

public class Multiply_Evens_By_Odds {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        String input = term.nextLine();
        if (input.charAt(0) == '-'){
            input = input.substring(1);
        }

        String[] copied = new String[input.length()];

        for (int i = 0; i < copied.length; i++) {
            copied[i] = String.valueOf(input.charAt(i));
        }

        int[] inputInInt = new int[copied.length];

        for (int i = 0; i < inputInInt.length; i++) {
            inputInInt[i] = Integer.parseInt(copied[i]);
        }

        int evenSum = getTheEvenSum(inputInInt);
        int oddSum = getTheOddSum(inputInInt);

        System.out.println(evenSum * oddSum);
    }

    private static int getTheEvenSum(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0){
                sum = sum + number[i];
            }
        }
        return sum;
    }

    private static int getTheOddSum(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 1){
                sum = sum + number[i];
            }
        }
        return sum;
    }
}
