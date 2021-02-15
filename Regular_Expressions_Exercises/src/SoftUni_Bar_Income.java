import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUni_Bar_Income {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();
        String regex = "%(?<name>[A-Z][a-z]+)%.*<(?<product>\\w+)>.*\\|(?<count>\\d+)\\|(\\D+)*(?<price>\\d+\\.?\\d+?)\\$";
        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0.0;

        while (!"end of shift".equals(input)){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String name = matcher.group("name");
                String product = matcher.group("product");
                double count = Double.parseDouble(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                double sum = count * price;
                totalSum = totalSum + sum;
                System.out.println(String.format("%s: %s - %.2f", name, product, sum));
            }

            input = term.nextLine();
        }
        System.out.println(String.format("Total income: %.2f", totalSum));
    }
}
