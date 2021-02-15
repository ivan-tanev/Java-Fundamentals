import java.util.Scanner;

public class Rage_Expenses {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int lostGames = Integer.parseInt(term.nextLine());
        float headsetRage = Float.parseFloat(term.nextLine());
        float mouseRage = Float.parseFloat(term.nextLine());
        float keyboardRage = Float.parseFloat(term.nextLine());
        float displayRage = Float.parseFloat(term.nextLine());

        double headsetRageCost = 0;
        double mouseRageCost = 0;
        double keyboardRageCost = 0;
        double displayRageCost = 0;
        double sum = 0;

        for (int i = 1; i <= lostGames; i++) {
            if (i % 2 == 0){
                headsetRageCost = headsetRageCost + headsetRage;
            }
            if (i % 3 == 0){
                mouseRageCost = mouseRageCost + mouseRage;
            }
            if (i % 6 == 0){
                keyboardRageCost = keyboardRageCost + keyboardRage;
            }
            if (i % 12 == 0){
                displayRageCost = displayRageCost + displayRage;
            }
        }
        sum = headsetRageCost + mouseRageCost + keyboardRageCost + displayRageCost;
        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}
