import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String name = term.nextLine();
        int age = Integer.parseInt(term.nextLine());
        double averageGrade = Double.parseDouble(term.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);

        String output = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, averageGrade);

        System.out.println(output);
    }
}
