import java.util.*;

public class Inbox_Manager_03 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        String input = term.nextLine();
        Map<String, List<String>> usersEmails = new LinkedHashMap<>();

        while (!"Statistics".equals(input)){
            String[] parts = input.split("->");
            String command = parts[0];
            String username = parts[1];

            switch (command){
                case "Add":
                    if (usersEmails.containsKey(username)){
                        System.out.println(String.format("%s is already registered", username));
                    } else {
                        usersEmails.put(username, new ArrayList<>());
                    }
                    break;
                case "Send":
                    String email = parts[2];
                    usersEmails.get(username).add(email);
                    break;
                case "Delete":
                    if (usersEmails.containsKey(username)){
                        usersEmails.remove(username);
                    } else {
                        System.out.println(String.format("%s not found!", username));
                    }
                    break;
            }

            input = term.nextLine();
        }
        System.out.println(String.format("Users count: %d", usersEmails.size()));

        usersEmails
                .entrySet()
                .stream()
                .sorted((first, second) -> {
                    int result = Integer.compare(second.getValue().size(), first.getValue().size());
                    if (result == 0){
                        result = first.getKey().compareTo(second.getKey());
                    }
                    return result;
                })
                .forEach(user -> {
                    System.out.println(user.getKey());
                    for (String email : user.getValue()) {
                        System.out.println(String.format(" - %s", email));
                    }
                });
    }
}
