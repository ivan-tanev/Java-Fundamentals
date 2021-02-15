import java.util.Scanner;

public class Integer_Operations {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int firstNum = Integer.parseInt(term.nextLine());
        int secondNum = Integer.parseInt(term.nextLine());
        int thirdNum = Integer.parseInt(term.nextLine());
        int fourthNum = Integer.parseInt(term.nextLine());

        int sum = ((firstNum + secondNum) / thirdNum) * fourthNum;
        System.out.println(sum);
    }
}
