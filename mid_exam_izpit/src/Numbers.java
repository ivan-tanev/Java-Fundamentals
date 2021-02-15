import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();
        List<Integer> top5Numbers = new ArrayList<>();

        double sum = 0;
        for (String n : input) {
            int s = Integer.parseInt(n);
            sum += s;
            numbers.add(s);
        }
        double averageNumber = sum / numbers.size();

        List<Integer> topFive = new ArrayList<>();

        for (int i = numbers.size() - 1; i > 0; i--) {
            if (numbers.get(i) > averageNumber) {
                topFive.add(numbers.get(i));
            }
            if (topFive.size() == 5) {
                break;
            }
        }

        if (topFive.size() == 5) {
            int a = topFive.get(0);
            int b = topFive.get(1);
            int c = topFive.get(2);
            int d = topFive.get(3);
            int e = topFive.get(4);
        }
        if (topFive.size() != 0){

            System.out.println(topFive.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("No");
        }
    }
}
