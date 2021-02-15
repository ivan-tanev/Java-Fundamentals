import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_Validator {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        String[] password = new String[input.length()];
        for (int i = 0; i < password.length; i++) {
            password[i] = String.valueOf(input.charAt(i));
        }

        boolean isPasswordBetween6And10 = checkPasswordValidation(password);
        boolean isPasswordConsistSpecialSymbols = checkPasswordForSymbols(password);
        boolean isPasswordHave2Digits = checkPasswordForDigits(password);

        if (isPasswordBetween6And10){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (isPasswordConsistSpecialSymbols){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!isPasswordHave2Digits){
            System.out.println("Password must have at least 2 digits");
        }
        if (!isPasswordBetween6And10 && !isPasswordConsistSpecialSymbols && isPasswordHave2Digits) {
            System.out.println("Password is valid");
        }

    }

    private static boolean checkPasswordForDigits(String[] password) {
        boolean have2digits = false;
        int count = 0;

        for (int i = 0; i < password.length; i++) {
            for (char j = '0'; j <= '9'; j++) {
                if (password[i].equals(String.valueOf(j))){
                    count++;
                }
            }
        }
        if (count >= 2){
            have2digits = true;
        }
        return have2digits;
    }

    private static boolean checkPasswordForSymbols(String[] password) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]");
        boolean haveSymbol = false;

        for (int i = 0; i < password.length; i++) {
            Matcher matcher = pattern.matcher(password[i]);
            if (!matcher.matches()){
                haveSymbol = true;
            }
        }
        return haveSymbol;
    }

    private static boolean checkPasswordValidation(String[] password) {
        boolean valid = false;
        if (password.length <= 5 || password.length >= 11 ){
            valid = true;
        }
            //System.out.println("Password must be between 6 and 10 characters");

        return valid;
    }
}
