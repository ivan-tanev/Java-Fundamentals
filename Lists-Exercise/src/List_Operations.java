import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Operations {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] integers = term.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        for (String integer : integers) {
            numbers.add(Integer.parseInt(integer));
        }

        String[] input = term.nextLine().split("\\s+");
        while (!"End".equals(input[0])){
            String command = input[0];

            switch (command){
                case "Add":
                    numbers.add(Integer.parseInt(input[1]));
                    break;
                case "Insert":
                    int index = Integer.parseInt(input[2]);
                    if (index < numbers.size() && index >= 0) {
                        numbers.add(index, Integer.parseInt(input[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    if (Integer.parseInt(input[1]) < numbers.size() && Integer.parseInt(input[1]) >= 0) {
                        numbers.remove(Integer.parseInt(input[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String subCommand = input[1];
                    switch (subCommand){
                        case "left":
                            int count = Integer.parseInt(input[2]);
                            for (int i = 0; i < count; i++) {
                                int hold = numbers.get(0);
                                numbers.remove(0);
                                numbers.add(hold);
                            }
                            break;
                        case "right":
                            count = Integer.parseInt(input[2]);
                            for (int i = count; i > 0; i--) {
                                int hold = numbers.get(numbers.size() - 1);
                                numbers.remove(numbers.size() - 1);
                                numbers.add(0, hold);
                            }
                            break;
                    }
                    break;
                default:
                    break;
            }

            input = term.nextLine().split("\\s+");
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
    }
}
