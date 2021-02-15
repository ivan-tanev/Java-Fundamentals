import java.util.Scanner;

public class SoftUni_Reception {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int workerOneEfficiency = Integer.parseInt(term.nextLine());
        int workerTwoEfficiency = Integer.parseInt(term.nextLine());
        int workerThreeEfficiency = Integer.parseInt(term.nextLine());
        int studentCount = Integer.parseInt(term.nextLine());

        int allEfficiency = workerOneEfficiency + workerTwoEfficiency + workerThreeEfficiency;
        int answered = 0;
        int time = 0;

        while (!(studentCount <= answered)){
            answered = answered + allEfficiency;
            if (time % 4 == 0){
                answered = answered - allEfficiency;
            }
            if (answered >= studentCount){
                break;
            } else if (answered < 0){
                time = 0;
                break;
            }

            time++;
        }

        System.out.printf("Time needed: %dh.", time);
    }
}
