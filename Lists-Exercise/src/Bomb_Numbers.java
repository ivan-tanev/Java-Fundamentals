import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bomb_Numbers {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split("\\s+");
        List<Integer> numbers = new ArrayList<>();
        streamToList(input, numbers);

        String[] input2 = term.nextLine().split("\\s+");
        int[] bombInfo = new int[input2.length];
        for (int i = 0; i < bombInfo.length; i++) {
            bombInfo[i] = Integer.parseInt(input2[i]);
        }

        int bomb = bombInfo[0];
        int power = bombInfo[1];

        while (numbers.contains(bomb)){
            int index = numbers.indexOf(bomb);

            int leftBound = Math.max(index - power, 0);
            int rightBound = Math.min(index + power, numbers.size() - 1);
            for (int i = rightBound; i >= leftBound; i--) {
                numbers.remove(i);
            }
        }
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }

        System.out.println(sum);
    }


    private static void streamToList(String[] input, List<Integer> numbers) {
        for (String so : input) {
            numbers.add(Integer.parseInt(so));
        }
    }
}
