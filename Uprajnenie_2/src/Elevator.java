import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int people = Integer.parseInt(term.nextLine());
        int capacity = Integer.parseInt(term.nextLine());

        int courses = (int) Math.ceil((double) people / capacity);
        System.out.println(courses);
    }
}
