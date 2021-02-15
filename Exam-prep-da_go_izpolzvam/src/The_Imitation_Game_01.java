import java.util.Scanner;

public class The_Imitation_Game_01 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String message = term.nextLine();
        String input = term.nextLine();

        while (!"Decode".equals(input)){
            String[] parts = input.split("\\|");
            String command = parts[0];

            switch (command){
                case "Move":
                    int numberOfLetters = Integer.parseInt(parts[1]);

                    for (int i = 0; i < numberOfLetters; i++) {
                        char current = message.charAt(0);
                        String current2 = message.substring(1);
                        message = current2 + current;
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(parts[1]);
                    String value = parts[2];

                    String one = message.substring(0, index);
                    String two = message.substring(index);
                    message = one + value + two;
                    break;
                case "ChangeAll":
                    String substring = parts[1];
                    String replacement = parts[2];

                    if (message.contains(substring)){
                        message = message.replace(substring, replacement);
                    }
                    break;
            }

            input = term.nextLine();
        }
        System.out.println(String.format("The decrypted message is: %s", message));
    }
}
