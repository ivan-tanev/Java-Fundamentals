import java.util.Scanner;

public class Passed_Or_Failed {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        double grade = Double.parseDouble(term.nextLine());

        if (grade >= 3.00){
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
