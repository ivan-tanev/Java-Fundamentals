import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Word_Filter {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        List<String> evenLengthWords = Arrays.stream(term.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .collect(Collectors.toList());

        for (String evenLengthWord : evenLengthWords) {
            System.out.println(evenLengthWord);
        }
    }
}
