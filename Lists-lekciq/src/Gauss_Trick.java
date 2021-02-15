import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gauss_Trick {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        String[] input = term.nextLine().split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String in : input) {
            int currentNumber = Integer.parseInt(in);

            numbers.add(currentNumber);
        }
        if (numbers.size() % 2 == 0) {
            for (int i = 0; i <= numbers.size() / 2; i++) {
                int current = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);

                numbers.remove(numbers.size() - 1);
                numbers.set(i, current + last);
            }
        } else {
            for (int i = 0; i < numbers.size() / 2; i++) {
                int current = numbers.get(i);
                int last = numbers.get(numbers.size() - 1);

                numbers.remove(numbers.size() - 1);
                numbers.set(i, current + last);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
