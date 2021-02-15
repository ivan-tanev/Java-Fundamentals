import java.util.Scanner;

public class Triples_Of_Latin_Letters {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int num = Integer.parseInt(term.nextLine());

        for (int i = 0; i < num; i++) {
            char firstLetter = (char) ('a' + i);
            for (int j = 0; j < num; j++) {
                char secondLetter = (char) ('a' + j);
                for (int k = 0; k < num; k++) {
                    char thirdLetter = (char) ('a' + k);
                    System.out.printf("%c%c%c%n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }
    }
}
