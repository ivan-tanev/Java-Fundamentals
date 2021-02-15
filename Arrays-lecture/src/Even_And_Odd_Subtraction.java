import java.util.Scanner;

public class Even_And_Odd_Subtraction {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        String[] input = term.nextLine().split(" ");
        int evenSum = 0;
        int oddSum = 0;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            int[] numbers = new int[input.length];
            numbers[i] = Integer.parseInt(input[i]);
            if (numbers[i] % 2 == 0){
                evenSum = evenSum + numbers[i];
            } else {
                oddSum = oddSum + numbers[i];
            }
        }
        sum = evenSum - oddSum;
        System.out.println(sum);
    }
}
