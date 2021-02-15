import java.util.Scanner;

public class Equal_Arrays {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        String[] first = term.nextLine().split(" ");
        String[] second = term.nextLine().split(" ");
        int sum = 0;
        int index = 0;
        boolean notIdentical = false;

        for (int i = 0; i < first.length; i++) {
            int[] firstInInt = new int[first.length];
            int[] secondInInt = new int[second.length];

            firstInInt[i] = Integer.parseInt(first[i]);
            secondInInt[i] = Integer.parseInt(second[i]);

            if (firstInInt[i] == secondInInt[i]){
                sum = sum + firstInInt[i];
            } else {
                index = i;
                notIdentical = true;
                break;
            }
        }
        if (!notIdentical){
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
        }
    }
}
