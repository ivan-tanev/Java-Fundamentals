import java.util.Scanner;

public class Concat_Names {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String name = term.nextLine();
        String name2 = term.nextLine();
        String delimiter = term.nextLine();

        System.out.printf("%s%s%s", name, delimiter, name2);
    }
}
