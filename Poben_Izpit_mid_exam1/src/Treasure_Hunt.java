import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Treasure_Hunt {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] chestArray = term.nextLine().split("\\|");
        List<String> chest = new ArrayList<>();
        for (int i = 0; i < chestArray.length; i++) {
            chest.add(chestArray[i]);
        }

        int duljinaNaSukrovisheto = chest.size();

        String[] input = term.nextLine().split("\\s+");
        while (!"Yohoho!".equals(input[0])){
            switch (input[0]){
                case "Loot":
                    for (int j = 1; j < input.length; j++) {
                        if (chest.contains(input[j])){

                        } else {
                            chest.add(0, input[j]);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(input[1]);
                    if (index < chest.size() && index >= 0){
                        String temp = chest.get(index);
                        chest.remove(index);
                        chest.add(chest.size(), temp);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(input[1]);
                    if (chest.size() > count){
                        for (int i = chest.size() - count; i < chest.size(); ) {
                            String temp = chest.get(i);
                            chest.remove(i);
                            if (i < chest.size()){
                                System.out.print(temp + ", ");
                            } else {
                                System.out.print(temp);
                                System.out.println();
                            }
                        }
                    } else {
                        for (String so : chest) {
                            if (chest.indexOf(so) < chest.size() - 1){
                                System.out.print(so + ", ");
                            } else {
                                System.out.print(so);
                                System.out.println();
                            }
                        }
                        System.out.println("Failed treasure hunt.");
                        return;
                    }
                    break;
            }

            input = term.nextLine().split("\\s+");
        }
        double itemsLength = 0;
        for (String so : chest) {
            itemsLength = itemsLength + so.length();
        }
        itemsLength = itemsLength / chest.size();
        System.out.printf("Average treasure gain: %.2f pirate credits.", itemsLength);
    }
}
