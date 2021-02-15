import java.util.Scanner;

public class Zig_Zag_Arrays {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        int[] numbers1 = new int[n];
        int[] numbers2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] numbers = term.nextLine().split(" ");

            if (i % 2 == 0){
                numbers1[i] = Integer.parseInt(numbers[0]);
                numbers2[i] = Integer.parseInt(numbers[1]);
            } else {
                numbers2[i] = Integer.parseInt(numbers[0]);
                numbers1[i] = Integer.parseInt(numbers[1]);
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(numbers2[i] + " ");
        }
    }
}
