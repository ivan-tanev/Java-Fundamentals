import java.util.Scanner;

public class Lower_Or_Upper {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        char something = term.nextLine().charAt(0);

        if (something >= 'A' && something <= 'Z')
            System.out.println("upper-case");

        else if (something >= 'a' && something <= 'z')
            System.out.println("lower-case" );
    }
}
