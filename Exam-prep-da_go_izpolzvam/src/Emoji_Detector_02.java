import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emoji_Detector_02 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String regex = "(?<emoji>::[A-Z][a-z]{2,}::|\\*\\*[A-Z][a-z]{2,}\\*\\*)";
        String regexDigit = "(?<digit>\\d)";

        Pattern pattern = Pattern.compile(regex);
        Pattern patternDigit = Pattern.compile(regexDigit);

        String input = term.nextLine();
        List<String> emojies = new ArrayList<>();
        List<String> coolEmojies = new ArrayList<>();

        long coolNumber = 1;

        Matcher matcher = pattern.matcher(input);
        Matcher matcherDigit = patternDigit.matcher(input);

        while (matcher.find()){
            emojies.add(matcher.group("emoji"));
        }
        while (matcherDigit.find()){
            String current = matcherDigit.group("digit");
            int currentNumber = Integer.parseInt(current);
            coolNumber = coolNumber * currentNumber;
        }

        for (int i = 0; i < emojies.size(); i++) {
            String current = emojies.get(i);
            int value = 0;
            for (int j = 2; j < current.length() - 2; j++) {
                value = value + (int)current.charAt(j);
            }
            if (value > coolNumber){
                coolEmojies.add(current);
            }
        }

        System.out.println(String.format("Cool threshold: %d", coolNumber));
        System.out.println(String.format("%d emojis found in the text. The cool ones are:", emojies.size()));
        for (String coolEmojy : coolEmojies) {
            System.out.println(coolEmojy);
        }
    }
}
