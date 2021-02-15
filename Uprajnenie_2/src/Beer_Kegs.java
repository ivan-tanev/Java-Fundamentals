import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beer_Kegs {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int counter = Integer.parseInt(term.nextLine());

        double maxVolume = 0;
        String biggestKeg = "";
        while (counter-- > 0){
            String model = term.nextLine();
            double radius = Double.parseDouble(term.nextLine());
            int height =Integer.parseInt(term.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > maxVolume){
                maxVolume = volume;
                biggestKeg = model;
            }

        }
        System.out.println(biggestKeg);
    }
}
