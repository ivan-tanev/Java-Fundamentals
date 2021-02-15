import java.util.Scanner;

public class Day_Of_Week {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int dayNumber = Integer.parseInt(term.nextLine());

        String[] dayOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        if (dayNumber > 0 && dayNumber <= 7){
            System.out.println(dayOfWeek[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
