import java.util.Scanner;

public class Top_Integers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            boolean isTopInteger = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNumber <= numbers[j]){
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger){
                System.out.print(currentNumber + " ");
            }
        }
        System.out.print(numbers[numbers.length - 1]);
    }
}
