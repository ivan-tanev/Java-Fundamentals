import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ad_Astra_02 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        List<String> items = new ArrayList<>();
        List<String> date = new ArrayList<>();
        List<Integer> calories = new ArrayList<>();

        String text = term.nextLine();
        int allCalories = 0;

        String regex = "(?<item>\\|[A-Z][A-Za-z|\\s]{2,}\\||#[A-Z][A-Za-z|\\s]{2,}#)(?<date>\\d{2}\\/\\d{2}\\/\\d{2})(?<calories>\\|\\d{1,5}\\||#\\d{1,5}#)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            String item = matcher.group("item");
            if (item.contains("#") || item.contains("|")){
                item = item.replace("#", "");
                item = item.replace("|", "");
            }
            items.add(item);
            date.add(matcher.group("date"));

            String cal = matcher.group("calories");
            if (cal.contains("#") || cal.contains("|")){
                cal = cal.replace("#", "");
                cal = cal.replace("|", "");
            }
            int current = Integer.parseInt(cal);

            calories.add(current);
            allCalories = allCalories + current;
        }

        int days = allCalories / 2000;

        System.out.println(String.format("You have food to last you for: %d days!", days));
        for (int i = 0; i < items.size(); i++) {
            System.out.print(String.format("Item: %s, ", items.remove(i).toString()));
            System.out.print(String.format("Best before: %s, ", date.remove(i)));
            System.out.print(String.format("Nutrition: %d", calories.remove(i)));
            System.out.println();
            i--;
        }
    }
}
