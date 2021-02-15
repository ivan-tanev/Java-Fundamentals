import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Remove_Negatives_And_Reverse {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String so : input) {
            int num = Integer.parseInt(so);
            numbers.add(num);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(i);
                i--;
            }
        }
        Collections.reverse(numbers);

        if (numbers.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
