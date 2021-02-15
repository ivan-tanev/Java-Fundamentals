import java.util.*;

public class Word_Synonyms {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        int pairsCount = Integer.parseInt(term.nextLine());

        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < pairsCount; i++) {
            String key = term.nextLine();
            String synonym = term.nextLine();

            if (synonyms.containsKey(key)){
                List<String> stringList = synonyms.get(key);
                stringList.add(synonym);

                synonyms.put(key, stringList);
            } else {
                List<String> synonymsList = new ArrayList<>();
                synonymsList.add(synonym);

                synonyms.put(key, synonymsList);
            }
        }

        for (Map.Entry<String, List<String>> entry : synonyms.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue().toString()
            .replaceAll("[\\]\\[]", ""));
        }
    }
}
