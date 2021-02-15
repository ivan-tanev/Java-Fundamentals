package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());


        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = term.nextLine();

            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String secondName = tokens[1];
            double grade = Double.parseDouble(tokens[2]);

            Student student = new Student(firstName, secondName, grade);
            students.add(student);
        }

        students.stream()
                .sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(s -> System.out.println(s));
    }
}
