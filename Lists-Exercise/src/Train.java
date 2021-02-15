import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split("\\s+");
        List<Integer> wagons = new ArrayList<>();
        for (String so : input) {
            wagons.add(Integer.parseInt(so));
        }
        int maxCapacity = Integer.parseInt(term.nextLine());
        String[] command = term.nextLine().split("\\s+");
        while (!command[0].equals("end")) {
            if (command[0].equals("Add")) {
                wagons.add(Integer.parseInt(command[1]));
            } else {
                int peopleToAdd = Integer.parseInt(command[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int sum = peopleToAdd + wagons.get(i);
                    if (sum <= maxCapacity){
                        wagons.set(i, sum);
                        break;
                    }
                }
            }

            command = term.nextLine().split("\\s+");
        }
        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}
