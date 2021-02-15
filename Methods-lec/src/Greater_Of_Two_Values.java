import java.util.Scanner;

public class Greater_Of_Two_Values {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();

        switch (input){
            case "int":
                int num1 = Integer.parseInt(term.nextLine());
                int num2 = Integer.parseInt(term.nextLine());

                int greater = getMax(num1, num2);
                System.out.println(greater);
                break;
            case "char":
                char first = term.nextLine().charAt(0);
                char second = term.nextLine().charAt(0);

                char greaterChar = getMax(first, second);
                System.out.println(greaterChar);
                break;
            case "string":
                String one = term.nextLine();
                String two = term.nextLine();

                String greaterString = getMax(one, two);
                System.out.println(greaterString);
                break;
        }
    }

    private static int getMax(int num1, int num2) {
        int max = 0;
        if (num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    private static char getMax(char first, char second){
        int diff = first - second;
        if (diff == 0){
            return first;
        } else if (diff > 0){
            return first;
        } else {
            return second;
        }
    }
    private static String getMax(String one, String two){
        if (one.compareTo(two) >= 0){
            return one;
        } else {
            return two;
        }
    }
}
