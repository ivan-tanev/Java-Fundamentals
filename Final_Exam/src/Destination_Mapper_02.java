import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Destination_Mapper_02 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        String regex01 = "=(?<destination01>[A-Z][A-Za-z_][A-Za-z_]+)=";
        String regex02 = "\\/(?<destination02>[A-Z][A-Za-z_][A-Za-z_]+)\\/";

        Pattern pattern01 = Pattern.compile(regex01);
        Pattern pattern02 = Pattern.compile(regex02);

        List<String> destinations = new ArrayList<>();
        Matcher matcher01 = pattern01.matcher(input);
        Matcher matcher02 = pattern02.matcher(input);

        for (int i = 0; i < input.length(); i++) {
            if (matcher01.find()) {
                destinations.add(matcher01.group("destination01"));
            }
            if (matcher02.find()) {
                destinations.add(matcher02.group("destination02"));
            }
        }

        if (destinations.isEmpty()){
            String stringIsEmpty = destinations.toString().replaceAll("[\\[\\]]", "");
            System.out.println(String.format("Destinations: %s", stringIsEmpty));
            System.out.println("Travel Points: 0");
        } else {
            int listLength = destinations.size();
            long pointsCount = 0;
            for (int i = 0; i < listLength; i++) {
                for (int j = 0; j < destinations.get(i).length(); j++) {
                    pointsCount++;
                }
            }
            System.out.println(String.format("Destinations: %s", destinations.toString().replaceAll("[\\[\\]]", "")));
            System.out.println(String.format("Travel Points: %d", pointsCount));
        }
    }
}
