import java.util.Scanner;

public class Sign_Of_Integer {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int number = Integer.parseInt(term.nextLine());

        printNumber(number);
    }
    public static void printNumber(int number) {
        if (number > 0){
            System.out.printf("The number %d is positive.", number);
        } else if (number < 0){
            System.out.printf("The number %d is negative.", number);
        } else if (number == 0){
            System.out.printf("The number %d is zero.", number);
        }
    }

}
