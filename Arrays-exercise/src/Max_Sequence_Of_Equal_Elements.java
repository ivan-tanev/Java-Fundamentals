import java.util.Scanner;

public class Max_Sequence_Of_Equal_Elements {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        int bestLength = 0;
        int digit = 0;
        int currentLength = 1;
        for (int i = 0; i < numbers.length - 1; i++) {
            int currentElement = numbers[i];
            int nextElement = numbers[i + 1];
            if (currentElement == nextElement){
                currentLength++;
                if (currentLength > bestLength){
                    bestLength = currentLength;
                    digit = currentElement;
                }
            } else {
                currentLength = 1;
            }
        }
        for (int i = 0; i < bestLength; i++) {
            System.out.print(digit + " ");
        }
    }
}
