import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_Chars_In_A_String {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split("\\s+");

        Map<Character, Integer> characters = new LinkedHashMap<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
                char symbol = input[i].charAt(j);
                characters.putIfAbsent(symbol, 0);
                int newValue = characters.get(symbol) + 1;
                characters.put(symbol, newValue);
            }
        }

        characters
                .forEach((k ,v) -> System.out.println(String.format("%s -> %d", k, v)));

    }
}
