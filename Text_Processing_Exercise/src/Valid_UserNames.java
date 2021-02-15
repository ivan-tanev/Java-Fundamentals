import java.util.Scanner;

public class Valid_UserNames {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] input = term.nextLine().split(", ");
        StringBuilder names = new StringBuilder();
        boolean print = false;

        for (int i = 0; i < input.length; i++) {
            String userName = input[i];
            if (userName.length() >= 3 && userName.length() <= 16){
                for (int j = 0; j < userName.length(); j++) {

                    if (Character.isLetter(userName.charAt(j))){
                        print = true;
                    }
                    if (Character.isDigit(userName.charAt(j))){
                        print = true;
                    }
                    if (Character.valueOf((char) j) == ('-')){
                        print = true;
                    }
                    if (Character.isDefined('_')){
                        print = true;
                    } else {
                        print = false;
                        break;
                    }
                }
                if (print){
                    names.append(userName);
                }
            }
        }
        System.out.println(names.toString());
    }
}
