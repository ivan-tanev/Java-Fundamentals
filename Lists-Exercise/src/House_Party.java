import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class House_Party {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(term.nextLine());
        List<String> listWithGuests = new ArrayList<>();

        for (int i = 0; i < countOfCommands; i++) {
            String[] command = term.nextLine().split("\\s+", 2);
            switch (command[1]){
                case "is going!":
                    if (listWithGuests.contains(command[0])){
                        System.out.printf("%s is already in the list!%n", command[0]);
                    } else {
                        listWithGuests.add(command[0]);
                    }
                    break;
                case "is not going!":
                    if (listWithGuests.contains(command[0])){
                        listWithGuests.remove(command[0]);
                    } else {
                        System.out.printf("%s is not in the list!%n", command[0]);
                    }
                    break;
            }
        }
        for (String listWithGuest : listWithGuests) {
            System.out.println(listWithGuest);
        }
    }
}
