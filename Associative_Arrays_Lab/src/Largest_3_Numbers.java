import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Largest_3_Numbers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        List<Integer> sorted = Arrays.stream(term.nextLine().split("\\s+"))
                .map(w -> Integer.parseInt(w))
                .sorted((w1, w2) -> w2.compareTo(w1))
                .collect(Collectors.toList());

        for (int i = 0; i < sorted.size(); i++) {
            if (i > 2){
                break;
            } else {
                System.out.print(sorted.get(i) + " ");
            }
        }
    }
}
