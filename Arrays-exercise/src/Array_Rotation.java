import java.util.Scanner;

public class Array_Rotation {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] numbers = term.nextLine().split(" ");
        int n = Integer.parseInt(term.nextLine());

        for (int i = 0; i < n; i++) {
            String pazimPurvotoChislo_OtMasiva = numbers[0];
            for (int j = 0; j < numbers.length - 1; j++) {
                numbers[j] = numbers[j + 1];
            }
            numbers[numbers.length - 1] = pazimPurvotoChislo_OtMasiva;
        }


        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
