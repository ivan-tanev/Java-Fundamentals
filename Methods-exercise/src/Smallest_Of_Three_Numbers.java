import java.util.Scanner;

public class Smallest_Of_Three_Numbers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int number1 = Integer.parseInt(term.nextLine());
        int number2 = Integer.parseInt(term.nextLine());
        int number3 = Integer.parseInt(term.nextLine());

        smallestNumber(number1, number2, number3);
    }

    private static void smallestNumber(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 < number3){
            System.out.println(number1);
        } else if (number2 <= number1 && number2 < number3){
            System.out.println(number2);
        } else if (number3 <= number1 && number3 <= number2){
            System.out.println(number3);
        }
    }
}
