import java.util.Scanner;

public class Water_Overflow {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int waterTank = 255;
        int n = Integer.parseInt(term.nextLine());
        int sum = 0;
        int littersInTank = 0;

        for (int i = 1; i <= n; i++) {
            int litters = Integer.parseInt(term.nextLine());
            sum = sum + litters;

            if (sum <= 255){
                littersInTank = sum;
            } else {
                sum = sum - litters;
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(littersInTank);
    }
}
