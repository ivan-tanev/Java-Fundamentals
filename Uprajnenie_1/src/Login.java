import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        String Username = term.nextLine();
        String password = "";
        for (int i = Username.length() - 1; i >= 0 ; i--) {
            password += Username.charAt(i);
        }
        for (int i = 0; i < 4; i++) {
            String inputPassword = term.nextLine();
            if (inputPassword.equals(password)){
                System.out.printf("User %s logged in.", Username);
                break;
            }
            if (i <= 2) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s blocked!", Username);
            }
        }
    }
}
