import java.util.Scanner;

public class Magic_Sum {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(" ");
        int num = Integer.parseInt(term.nextLine());
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }


        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == num){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
