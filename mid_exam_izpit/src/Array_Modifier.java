import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Modifier {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] array = term.nextLine().split(" ");
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(i, Integer.parseInt(array[i]));
        }
        String input = term.nextLine();
        while (!"end".equals(input)){
            String[] commands = input.split(" ");
            String command = commands[0];
            int index1 = 0;
            int index2 = 0;
            switch (command){

                case "swap":
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);
                    int temp1 = arrayList.get(index1);
                    int temp2 = arrayList.get(index2);
                    arrayList.remove(index1);
                    arrayList.add(index1, temp2);
                    arrayList.remove(index2);
                    arrayList.add(index2, temp1);

                    break;
                case "multiply":
                    index1 = Integer.parseInt(commands[1]);
                    index2 = Integer.parseInt(commands[2]);
                    int sum = arrayList.get(index1) * arrayList.get(index2);
                    arrayList.remove(index1);
                    arrayList.add(index1, sum);
                    break;
                case "decrease":
                    for (int i = 0; i < arrayList.size(); i++) {
                        int temp = arrayList.get(i) - 1;
                        arrayList.set(i, temp);
                    }
                    break;
            }

            input = term.nextLine();
        }
        System.out.println(arrayList.toString().replaceAll("[\\[\\]]", ""));
    }
}
