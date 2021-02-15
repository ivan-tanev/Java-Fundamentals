import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int people = Integer.parseInt(term.nextLine());
        String typeOfPeople = term.nextLine();
        String day = term.nextLine();
        double price = 0;
        double businessForFree = 0;
        double totalPrice = 0;

        switch (typeOfPeople){
            case "Students":
                if (day.equals("Friday")){
                    price = people * 8.45;
                } else if (day.equals("Saturday")){
                    price = people * 9.80;
                } else if (day.equals("Sunday")){
                    price = people * 10.46;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price = people * 10.90;
                    businessForFree = (people - 10) * 10.90;
                } else if (day.equals("Saturday")){
                    price = people * 15.60;
                    businessForFree = (people - 10) * 15.60;
                } else if (day.equals("Sunday")){
                    price = people * 16;
                    businessForFree = (people - 10) * 16;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = people * 15;
                } else if (day.equals("Saturday")){
                    price = people * 20;
                } else if (day.equals("Sunday")){
                    price = people * 22.50;
                }
                break;
        }
        if (people >= 30 && typeOfPeople.equals("Students")){
            totalPrice = price * 0.85;
        } else if (people >= 100 && typeOfPeople.equals("Business")){
            totalPrice = businessForFree;
        } else if (people >= 10 && people <= 20 && typeOfPeople.equals("Regular")){
            totalPrice = price * 0.95;
        } else {
            totalPrice = price;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
