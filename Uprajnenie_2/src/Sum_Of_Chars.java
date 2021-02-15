import java.util.Scanner;

public class Sum_Of_Chars {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            char letter = term.nextLine().charAt(0);
            sum = sum + letter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
