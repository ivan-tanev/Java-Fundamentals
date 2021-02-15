import java.util.Scanner;

public class Even_Number {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int number = Integer.parseInt(term.nextLine());


        if (number % 2 == 1 || number % 2 == -1){
            for (int i = number; i % 2 == 1 || i % 2 == -1; i = number) {
                System.out.println("Please write an even number.");
                number = Integer.parseInt(term.nextLine());
            }
        }
        if (number % 2 == 0){
            System.out.printf("The number is: %d", Math.abs(number));
        }
    }
}
