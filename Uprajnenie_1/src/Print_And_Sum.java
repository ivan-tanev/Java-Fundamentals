import java.util.Scanner;

public class Print_And_Sum {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int startNumber = Integer.parseInt(term.nextLine());
        int endNumber = Integer.parseInt(term.nextLine());
        int sum = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + " ");
            sum = sum + i;
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
