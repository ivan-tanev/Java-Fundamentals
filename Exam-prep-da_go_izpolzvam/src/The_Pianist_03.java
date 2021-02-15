import java.util.*;

public class The_Pianist_03 {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        Map<String, String> pieceComposer = new LinkedHashMap<>();
        Map<String, String> pieceKey = new LinkedHashMap<>();

        int n = Integer.parseInt(term.nextLine());
        for (int i = 0; i < n; i++) {
            String input = term.nextLine();
            String[] parts = input.split("\\|");
            String piece = parts[0];
            String composer = parts[1];
            String key = parts[2];

            pieceComposer.put(piece, composer);
            pieceKey.put(piece, key);
        }
        String input = term.nextLine();

        while (!"Stop".equals(input)){
            String[] parts = input.split("\\|");
            String command = parts[0];
            String piece = parts[1];

            switch (command){
                case "Add":
                    String composer = parts[2];
                    String key = parts[3];

                    if (pieceComposer.containsKey(piece)){
                        System.out.println(String.format("%s is already in the collection!", piece));
                    } else {
                        pieceComposer.put(piece, composer);
                        pieceKey.put(piece, key);
                        System.out.println(String.format("%s by %s in %s added to the collection!", piece, composer, key));
                    }
                    break;
                case "Remove":
                    if (pieceComposer.containsKey(piece)){
                        pieceComposer.remove(piece);
                        pieceKey.remove(piece);
                        System.out.println(String.format("Successfully removed %s!", piece));
                    } else {
                        System.out.println(String.format("Invalid operation! %s does not exist in the collection.", piece));
                    }
                    break;
                case "ChangeKey":
                    String newKey = parts[2];

                    if (pieceKey.containsKey(piece)) {
                        pieceKey.put(piece, newKey);
                        System.out.println(String.format("Changed the key of %s to %s!", piece, newKey));
                    } else {
                        System.out.println(String.format("Invalid operation! %s does not exist in the collection.", piece));
                    }
                    break;
            }

            input = term.nextLine();
        }
        pieceComposer
                .entrySet()
                .stream()
                .sorted((a, b) ->{
                    int result = a.getKey().compareTo(b.getKey());
                    if (result == 0){
                        result = a.getValue().compareTo(b.getValue());
                    }
                    return result;
                })
                .forEach(piece -> {
            System.out.println(String.format("%s -> Composer: %s, Key: %s", piece.getKey(), piece.getValue(), pieceKey.get(piece.getKey())));
        });
    }
}
