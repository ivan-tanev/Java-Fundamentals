import java.util.Scanner;

public class Student_Information {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String name = term.nextLine();
        int age = Integer.parseInt(term.nextLine());
        double grade = Double.parseDouble(term.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
