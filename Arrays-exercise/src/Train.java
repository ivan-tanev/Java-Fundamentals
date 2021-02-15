import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        int sum = 0;
        String[] people = new String[n];

        for (int i = 0; i < n; i++) {
            people[i] = term.nextLine();

            sum = sum + Integer.parseInt(people[i]);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(people[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
