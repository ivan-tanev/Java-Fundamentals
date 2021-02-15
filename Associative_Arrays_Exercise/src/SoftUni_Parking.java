import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUni_Parking {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        Map<String, String> users = new LinkedHashMap<>();


        int n = Integer.parseInt(term.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = term.nextLine().split("\\s+");
            String command = tokens[0];
            String userName = tokens[1];

            switch (command){
                case "register":
                    String plateNumber = tokens[2];
                    if (users.containsKey(userName)){
                        System.out.println(String.format("ERROR: already registered with plate number %s", plateNumber));
                        continue;
                    } else {
                        users.put(userName, plateNumber);
                        System.out.println(String.format("%s registered %s successfully", userName, plateNumber));
                    }

                    break;
                case "unregister":
                    if (!users.containsKey(userName)){
                        System.out.println(String.format("ERROR: user %s not found", userName));
                    } else {
                        users.remove(userName);
                        System.out.println(String.format("%s unregistered successfully", userName));
                    }
                    break;
            }
        }

        users
                .entrySet()
                .stream()
                .forEach(user -> System.out.println(String.format("%s => %s", user.getKey(), user.getValue())));
    }
}
