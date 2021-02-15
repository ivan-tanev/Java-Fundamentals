import java.util.Scanner;

public class Padawan_Equipment {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        double ivanChoMoney = Double.parseDouble(term.nextLine());
        int padawanCount = Integer.parseInt(term.nextLine());
        double priceOfLightsabers = Double.parseDouble(term.nextLine());
        double robeSinglePrice = Double.parseDouble(term.nextLine());
        double beltSinglePrice = Double.parseDouble(term.nextLine());

        double lightSabersTotalPrice = Math.ceil(padawanCount * 1.1);
        double robesTotalPrice = padawanCount * robeSinglePrice;
        int freeBeltsCount = padawanCount / 6;
        double beltsTotalPrice = (padawanCount - freeBeltsCount) * beltSinglePrice;

        double finalPrice = lightSabersTotalPrice * priceOfLightsabers + robesTotalPrice + beltsTotalPrice;
        if (finalPrice > ivanChoMoney){
            double moneyNeed = finalPrice - ivanChoMoney;
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeed);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", finalPrice);
        }
    }
}
