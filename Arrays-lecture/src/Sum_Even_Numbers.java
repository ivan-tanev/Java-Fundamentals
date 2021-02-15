import java.util.Scanner;

public class Sum_Even_Numbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String[] numbers = term.nextLine().split(" ");
        int[] numbersInInt = new int[numbers.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbersInInt[i] = Integer.parseInt(numbers[i]);
            if (numbersInInt[i] % 2 == 0){
                sum = sum + numbersInInt[i];
            }
        }
        System.out.println(sum);
    }
}
