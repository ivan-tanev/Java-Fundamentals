import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Change_List_Lubo_Version {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] integerList = term.nextLine().split("\\s+");
        List<Integer> elements = new ArrayList<>();
        for (String so : integerList) {
            elements.add(Integer.valueOf(so));
        }

        String input = term.nextLine();
        while (!"end".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int element = Integer.parseInt(tokens[1]);
            if ("Delete".equals(command)){
                while (elements.contains(element)){
                    elements.remove(Integer.valueOf(element));
                }
            } else if ("Insert".equals(command)){
                int position = Integer.parseInt(tokens[2]);
                if (position >= 0 && position < elements.size()){
                    elements.add(position, element);
                }
            }
            input = term.nextLine();
        }
        for (Integer element : elements) {
            System.out.print(element + " ");
        }
    }
}
