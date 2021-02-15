import java.util.Scanner;

public class Black_Flag {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int days = Integer.parseInt(term.nextLine());
        int plqchkaZaDen = Integer.parseInt(term.nextLine());
        double ochakvanaPlqchka = Double.parseDouble(term.nextLine());

        double plqchka = 0;

        for (int i = 1; i <= days; i++) {
            plqchka = plqchka + plqchkaZaDen;
            if (i % 3 == 0){
                plqchka = plqchka + (plqchkaZaDen / 2.0);
            }

            if (i % 5 == 0) {
                plqchka = plqchka * 0.7;
            }
        }
        if (plqchka >= ochakvanaPlqchka){
            System.out.printf("Ahoy! %.2f plunder gained.", plqchka);
        } else {
            double procenti = plqchka / ochakvanaPlqchka * 100;
            System.out.printf("Collected only %.2f%% of the plunder.",procenti);
        }
    }
}
