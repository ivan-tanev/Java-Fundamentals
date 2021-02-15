import java.util.Scanner;

public class Common_Elements {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input1 = term.nextLine().split(" ");
        String[] input2 = term.nextLine().split(" ");

        for (int i = 0; i < input2.length; i++) {
            for (int j = 0; j < input1.length; j++) {
                if (input2[i].equals(input1[j])){
                    System.out.print(input1[j] + " ");
                }
            }
        }
    }
}
