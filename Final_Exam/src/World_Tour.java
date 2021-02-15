import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class World_Tour {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String stops = term.nextLine();
        String input = term.nextLine();

        StringBuilder stringBuilder = new StringBuilder();

        while (!"Travel".equals(input)){
            String[] commands = input.split(":");
            String command = commands[0];

            if ("Add Stop".equals(command)) {
                int index = Integer.parseInt(commands[1]);
                String toAdd = commands[2];

                if (index >= 0 && index < stops.length()) {
                    String part1 = "";
                    String part2 = "";

                    for (int i = 0; i < index; i++) {
                        part1 = part1.concat(String.valueOf(stops.charAt(i)));
                    }
                    for (int i = index; i < stops.length(); i++) {
                        part2 = part2.concat(String.valueOf(stops.charAt(i)));
                    }

                    stops = part1.concat(toAdd).concat(part2);
                    System.out.println(stops);
                } else {
                    System.out.println(stops);
                }
            } else if ("Remove Stop".equals(command)) {
                int startIndex = Integer.parseInt(commands[1]);
                int endIndex = Integer.parseInt(commands[2]);
                if ( startIndex >= 0 && endIndex <= stops.length() - 1 || startIndex == endIndex) {
                    String part1 = "";
                    String part2 = "";

                    for (int i = 0; i < startIndex; i++) {
                        part1 = part1.concat(String.valueOf(stops.charAt(i)));
                    }
                    for (int i = endIndex + 1; i < stops.length(); i++) {
                        part2 = part2.concat(String.valueOf(stops.charAt(i)));
                    }
                    stops = part1.concat(part2);
                    System.out.println(stops);
                } else {
                    System.out.println(stops);
                }
            } else if ("Switch".equals(command)) {
                String oldString = commands[1];
                String newString = commands[2];

                while (stops.contains(oldString)) {

                    stringBuilder.append(stops.replace(oldString, newString));
                    stops = stringBuilder.toString();
                    stringBuilder.delete(0, stringBuilder.length());
                }
                System.out.println(stops);
            } else {
                System.out.println(stops);
            }

            input = term.nextLine();
        }
        System.out.println(String.format("Ready for world tour! Planned stops: %s", stops));
    }
}
