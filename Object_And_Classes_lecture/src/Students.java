import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();
        List<Student> students = new ArrayList<>();

        while (!"end".equals(input)){
            String[] data = input.split("\\s+");
            String firstName = data[0];
            String secondName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            Student student = new Student(firstName,secondName,age, city);

            students.add(student);

            input = term.nextLine();
        }
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size(); j++) {
                if (students.get(i).getFirstName().equals(students.get(j).getFirstName()) &&
                        students.get(i).getSecondName().equals(students.get(j).getSecondName()) &&
                        i != j){

                    students.remove(i);
                }
            }
        }


        String studentCity = term.nextLine();

        for (Student student : students) {
            if (student.getCity().equals(studentCity)){
                System.out.printf("%s %s is %d years old%n", student.getFirstName(),
                        student.getSecondName(), student.getAge());
            }
        }
    }
}
