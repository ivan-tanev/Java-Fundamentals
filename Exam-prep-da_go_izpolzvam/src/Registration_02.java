import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration_02 {
    public static void main(String[] args) {
         Scanner term = new Scanner(System.in);

         int n = Integer.parseInt(term.nextLine());
         String regex = "U\\$(?<username>[A-Z][a-z]{2,})U\\$P@\\$(?<password>\\w{5,}\\d+)P@\\$";
         Pattern pattern = Pattern.compile(regex);

         int counter = 0;

        for (int i = 0; i < n; i++) {
            String input = term.nextLine();
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String username = matcher.group("username");
                String password = matcher.group("password");

                System.out.println("Registration was successful");
                System.out.println(String.format("Username: %s, Password: %s", username, password));

                counter++;
            } else {
                System.out.println("Invalid username or password");
            }
        }
        System.out.println(String.format("Successful registrations: %d", counter));
    }
}
