import java.util.Scanner;

public class Refactor_Sum_Of_Odd_Numbers {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        int sum = 0;

        for (int i = 1; i < n * 2; i++) {
            if (i % 2 == 1){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
