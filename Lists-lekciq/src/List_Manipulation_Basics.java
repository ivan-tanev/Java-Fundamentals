import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Manipulation_Basics {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] numbers = term.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String number : numbers) {
            numbersList.add(Integer.parseInt(number));
        }

        String[] input = term.nextLine().split(" ");
        while (!input[0].equals("end")){
            int part = Integer.parseInt(input[1]);
            switch (input[0]){
                case "Add":
                    numbersList.add(part);
                    break;
                case "Remove":
                    numbersList.remove(Integer.valueOf(part));
                    break;
                case "RemoveAt":
                    numbersList.remove(part);
                    break;
                case "Insert":
                    numbersList.add(Integer.parseInt(input[2]), part);
                    break;
            }
            input = term.nextLine().split(" ");
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
