import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(numbers.stream()
                .distinct().count() == 1 ?
                "No" : numbers.stream()
                .filter(n -> n > numbers.stream().collect(Collectors.averagingInt(Integer::intValue)))
                .sorted(Comparator.comparingInt(Integer::intValue).reversed())
                .limit(5).collect(Collectors.toList()).toString().replaceAll("[\\[\\],]", ""));
    }
}