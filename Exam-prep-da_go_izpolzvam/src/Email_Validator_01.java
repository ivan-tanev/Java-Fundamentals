import java.util.Scanner;

public class Email_Validator_01 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String email = term.nextLine();
        String input = term.nextLine();

        while (!"Complete".equals(input)){
            String[] commands = input.split("\\s+");
            String command = commands[0];
            switch (command){
                case "Make":
                    String letterCase = commands[1];
                    if (letterCase.equals("Upper")){
                        email = email.toUpperCase();
                        System.out.println(email);
                    } else {
                        email = email.toLowerCase();
                        System.out.println(email);
                    }
                    break;
                case "GetDomain":
                    int count = Integer.parseInt(commands[1]);
                    int characterFromTo = email.length() - count;
                    System.out.println(email.substring(characterFromTo));
                    break;
                case "GetUsername":
                    if (email.contains("@")){
                        System.out.println(email.substring(0, email.indexOf('@')));
                    } else {
                        System.out.println(String.format("The email %s doesn't contain the @ symbol.", email));
                    }
                    break;
                case "Replace":
                    String symbol = commands[1];
                    if (email.contains(symbol)) {
                        email = email.replace(symbol, "-");
                    }
                    System.out.println(email);
                    break;
                case "Encrypt":
                    for (int i = 0; i < email.length(); i++) {
                        char ch = email.charAt(i);
                        System.out.print((int) ch + " ");
                    }
                    System.out.println();
                    break;
            }

            input = term.nextLine();
        }
    }
}
