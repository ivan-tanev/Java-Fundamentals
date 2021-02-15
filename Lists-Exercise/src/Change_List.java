import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Change_List {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] integerList = term.nextLine().split("\\s+");
        List<Integer> elements = new ArrayList<>();
        for (String so : integerList) {
            elements.add(Integer.valueOf(so));
        }
        String input = term.nextLine();
        while (!input.equals("end")){
            String[] parts = input.split("\\s+");
            String command = parts[0];
            Integer value = Integer.parseInt(parts[1]);
            switch (command){
                case "Delete":
                    while (elements.contains(value)) {
                        elements.remove(value);
                    }
                    break;
                case "Insert":
                    int position = Integer.parseInt(parts[2]);
                    elements.add(position, value);
                    break;
            }

            input = term.nextLine();
        }
        for (Integer element : elements) {
            System.out.print(element + " ");
        }
    }
}
