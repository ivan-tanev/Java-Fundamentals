import java.util.Scanner;

public class napoqvane {
    public static void main(String[] args) {


        int polivaniq1 = 0;
        int polivaniq2 = 0;

        for (int i = 1; i <= 8; i++) {
            if(i == 2 || i == 4 || i == 6 || i == 8){
                polivaniq1 = polivaniq1 + 1;
            }
            if(i == 4 || i == 8){
                polivaniq2 = polivaniq2 + 1;
            }
        }
        System.out.println("Polivame 8 puti v meseca ot koito:");
        System.out.printf("- polivame %d puti s preparat 1%n",polivaniq1);
        System.out.printf("- polivame %d puti s preparat 2%n",polivaniq2);
        if (polivaniq1 == 4 && polivaniq2 == 2){
            System.out.println("- na poslednoto polivane polivame s dvata preparata");
        }
    }
}
