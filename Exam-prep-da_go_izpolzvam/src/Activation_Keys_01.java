import java.util.Scanner;

public class Activation_Keys_01 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String productKey = term.nextLine();
        String input = term.nextLine();

        while (!"Generate".equals(input)){
            String[] parts = input.split(">>>");
            String command = parts[0];
            switch (command){
                case "Contains":
                    String substring = parts[1];
                    if (productKey.contains(substring)){
                        System.out.println(String.format("%s contains %s", productKey, substring));
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String letterCase = parts[1];
                    int startIndex = Integer.parseInt(parts[2]);
                    int endIndex = Integer.parseInt(parts[3]);

                    if (letterCase.equals("Upper")){
                        String one = productKey.substring(0,startIndex);
                        String two = productKey.substring(startIndex, endIndex);
                        String three = productKey.substring(endIndex);
                        two = two.toUpperCase();
                        productKey = one + two + three;
                    } else {
                        String one = productKey.substring(0,startIndex);
                        String two = productKey.substring(startIndex, endIndex);
                        String three = productKey.substring(endIndex);
                        two = two.toLowerCase();
                        productKey = one + two + three;
                    }
                    System.out.println(productKey);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(parts[1]);
                    endIndex = Integer.parseInt(parts[2]);

                    String one = productKey.substring(0,startIndex);
                    String three = productKey.substring(endIndex);
                    productKey = one + three;

                    System.out.println(productKey);
                    break;
            }

            input = term.nextLine();
        }
        System.out.println(String.format("Your activation key is: %s", productKey));
    }
}
