import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Manipulation_Advanced {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String[] numbers = term.nextLine().split(" ");
        List<Integer> numbersList = new ArrayList<>();
        for (String number : numbers) {
            numbersList.add(Integer.parseInt(number));
        }

        String[] input = term.nextLine().split(" ");

        while (!input[0].equals("end")){

            switch (input[0]){
                case "Contains":
                    boolean contains = numbersList.contains(Integer.parseInt(input[1]));
                    if (contains){
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch (input[1]){
                        case "even":
                            printAllEven(numbersList);
                            break;
                        case "odd":
                            printAllOdd(numbersList);
                            break;
                    }
                    break;
                case "Get":
                    if (input[1].equals("sum")){
                        printSum(numbersList);
                    }
                    break;
                case "Filter":
                    printNumbers(numbersList, input[1], input[2]);
                    break;
            }

            input = term.nextLine().split(" ");
        }
    }

    private static void printNumbers(List<Integer> numbersList, String condition, String number) {
        int num = Integer.parseInt(number);
        switch (condition){
            case "<":
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) < num){
                        System.out.print(numbersList.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case ">":
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) > num){
                        System.out.print(numbersList.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case "<=":
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) <= num){
                        System.out.print(numbersList.get(i) + " ");
                    }
                }
                System.out.println();
                break;
            case ">=":
                for (int i = 0; i < numbersList.size(); i++) {
                    if (numbersList.get(i) >= num){
                        System.out.print(numbersList.get(i) + " ");
                    }
                }
                System.out.println();
                break;
        }
    }

    private static void printSum(List<Integer> numbersList) {
        int sum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            sum = sum + numbersList.get(i);
        }
        System.out.println(sum);
    }

    private static void printAllOdd(List<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 1){
                System.out.print(numbersList.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printAllEven(List<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0){
                System.out.print(numbersList.get(i) + " ");
            }
        }
        System.out.println();
    }
}
