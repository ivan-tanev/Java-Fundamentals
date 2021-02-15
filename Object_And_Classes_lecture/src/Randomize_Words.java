import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Randomize_Words {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split("\\s+");
        Random randomIndex = new Random();

        for (int i = 0; i < input.length; i++) {
            int random = randomIndex.nextInt(input.length);

            String word = input[i];
            input[i] = input[random];
            input[random] = word;
        }

        for (String word : input) {
            System.out.println(word);
        }
    }
}
