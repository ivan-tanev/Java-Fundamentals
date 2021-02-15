import java.util.Scanner;

public class Back_In_30_Minutes {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int hours = Integer.parseInt(term.nextLine());
        int minutes = Integer.parseInt(term.nextLine());
        int hoursInMinutes = hours * 60;

        int timePlus30Minutes = minutes + 30;
        if (timePlus30Minutes >= 60){
            timePlus30Minutes = timePlus30Minutes - 60;
            hours++;
        } else {

        }
        if (hours > 23){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, timePlus30Minutes);
    }
}
