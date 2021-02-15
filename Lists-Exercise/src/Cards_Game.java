import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cards_Game {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input1 = term.nextLine().split("\\s+");
        String[] input2 = term.nextLine().split("\\s+");

        List<Integer> firstHand = new ArrayList<>();
        arrayToList(input1, firstHand);
        List<Integer> secondHand = new ArrayList<>();
        arrayToList(input2, secondHand);

        int i = 0;
        while (!firstHand.isEmpty() || !secondHand.isEmpty()) {
            if (firstHand.get(i) > secondHand.get(i)) {
                int card1 = 0;
                int card2 = 0;

                card1 = firstHand.get(i);
                firstHand.remove(i);
                firstHand.add(card1);
                card2 = secondHand.get(i);
                secondHand.remove(i);
                firstHand.add(card2);

                if (secondHand.size() == 0){
                    break;
                }

            } else if (firstHand.get(i) < secondHand.get(i)) {
                int card2 = 0;
                int card1 = 0;

                card2 = secondHand.get(i);
                secondHand.remove(i);
                secondHand.add(card2);
                card1 = firstHand.get(i);
                firstHand.remove(i);
                secondHand.add(card1);

                if (firstHand.size() == 0){
                    break;
                }

            } else {
                firstHand.remove(i);
                secondHand.remove(i);
                if (firstHand.size() == 0){
                    break;
                } else if (secondHand.size() == 0){
                    break;
                }
            }
        }


        if (firstHand.isEmpty()){
            int finalSum2 = calculateFinalSum(secondHand);
            System.out.printf("Second player wins! Sum: %d", finalSum2);
        } else {
            int finalSum1 = calculateFinalSum(firstHand);
            System.out.printf("First player wins! Sum: %d", finalSum1);
        }
    }

    private static int calculateFinalSum(List<Integer> firstHand) {
        int sum = 0;
        for (Integer integer : firstHand) {
            sum = sum + integer;
        }
        return sum;
    }

    private static void arrayToList(String[] array, List<Integer> list) {
        for (String so : array) {
            list.add(Integer.parseInt(so));
        }
    }
}
