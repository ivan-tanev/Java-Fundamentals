import java.math.BigDecimal;
import java.util.Scanner;

public class Town_Info {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String townName = term.nextLine();
        int population = Integer.parseInt(term.nextLine()) ;
        int area = Integer.parseInt(term.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", townName, population, area);
    }
}
