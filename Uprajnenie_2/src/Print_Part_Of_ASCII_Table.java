import java.util.Scanner;

public class Print_Part_Of_ASCII_Table {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int from = Integer.parseInt(term.nextLine());
        int to = Integer.parseInt(term.nextLine());

        for (int i = from; i <= to; i++) {
            char sign = (char) i;
            System.out.print(sign + " ");
        }
    }
}
