import java.util.Scanner;

public class Theatre_Promotion {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String day = term.nextLine();
        int age = Integer.parseInt(term.nextLine());

        if (0 <= age && age <= 18) {
            if (day.equals("Weekday")) {
                System.out.println(12 + "$");
            } else if (day.equals("Weekend")) {
                System.out.println(15 + "$");
            } else if (day.equals("Holiday")){
                System.out.println(5 + "$");
            } else {
                System.out.println("Error!");
            }
        } else if (19 <= age && age <= 64) {
            if (day.equals("Weekday")) {
                System.out.println(18 + "$");
            } else if (day.equals("Weekend")) {
                System.out.println(20 + "$");
            } else if (day.equals("Holiday")){
                System.out.println(12 + "$");
            } else {
                System.out.println("Error!");
            }
        } else if (65 <= age && age <= 122) {
            if (day.equals("Weekday")) {
                System.out.println(12 + "$");
            } else if (day.equals("Weekend")) {
                System.out.println(15 + "$");
            } else if (day.equals("Holiday")){
                System.out.println(10 + "$");
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
        }
    }
}
