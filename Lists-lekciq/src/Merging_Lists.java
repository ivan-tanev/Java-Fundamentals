import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Merging_Lists {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        List<String> inputOne = Arrays.asList(term.nextLine().split(" "));
        List<String> inputTwo = Arrays.asList(term.nextLine().split(" "));

        if (inputOne.size() > inputTwo.size() || inputOne.size() == inputTwo.size()){
            for (int i = 0; i < inputTwo.size(); i++) {
                System.out.print(inputOne.get(i) + " ");
                System.out.print(inputTwo.get(i) + " ");
            }
        } else if (inputOne.size() < inputTwo.size()) {
            for (int i = 0; i < inputOne.size(); i++) {
                System.out.print(inputOne.get(i) + " ");
                System.out.print(inputTwo.get(i) + " ");
            }
        }
        if (inputOne.size() > inputTwo.size()){
            for (int i = inputTwo.size(); i < inputOne.size(); i++) {
                System.out.print(inputOne.get(i) + " ");
            }
        } else {
            for (int i = inputOne.size(); i < inputTwo.size(); i++) {
                System.out.print(inputTwo.get(i) + " ");
            }
        }
    }
}
