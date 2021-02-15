import java.util.Scanner;

public class Add_And_Subtract {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int first = Integer.parseInt(term.nextLine());
        int second = Integer.parseInt(term.nextLine());
        int third = Integer.parseInt(term.nextLine());

        int sumOfFirstTwo = sumOfFirstTwoIntegers(first, second);
        int subtractOfSum = subtractOfThird(sumOfFirstTwo, third);

        System.out.println(subtractOfSum);
    }

    private static int subtractOfThird(int sumOfFirstTwo, int third) {
        int subtract = sumOfFirstTwo - third;
        return subtract;
    }

    private static int sumOfFirstTwoIntegers(int first, int second) {
        int sum = first + second;
        return sum;
    }
}
