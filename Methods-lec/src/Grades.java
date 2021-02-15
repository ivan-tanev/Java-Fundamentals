import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        double grade = Double.parseDouble(term.nextLine());

        printGrade(grade);
    }

    private static void printGrade(double number) {
        if (number >= 2 && number < 3){
            System.out.println("Fail");
        } else if (number >= 3 && number < 3.5){
            System.out.println("Poor");
        } else if (number >= 3.5 && number < 4.5){
            System.out.println("Good");
        }else if (number >= 4.5 && number < 5.5){
            System.out.println("Very good");
        } else if (number >= 5.5 && number <= 6){
            System.out.println("Excellent");
        }
    }

}
