package Articles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());

        List<Article> articles = new ArrayList<>();



        for (int i = 0; i < n; i++) {
            String input = term.nextLine();

            String[] articleData = input.split(", ");
            String initialTitle = articleData[0];
            String initialContent = articleData[1];
            String initialAuthor = articleData[2];

            Article article = new Article(initialTitle, initialContent, initialAuthor);
            articles.add(article);
        }
        String input = term.nextLine();

        if ("title".equals(input)){
                articles.stream()
                        .sorted((t1, t2) -> t1.getTitle().compareTo(t2.getTitle()))
                        .forEach(t -> System.out.println(t));
        } else if ("content".equals(input)){
            articles.stream()
                    .sorted((c1, c2) -> c1.getContent().compareTo(c2.getContent()))
                    .forEach(c -> System.out.println(c));
        } else if ("author".equals(input)){
            articles.stream()
                    .sorted((a1, a2) -> a1.getAuthor().compareTo(a2.getAuthor()))
                    .forEach(a -> System.out.println(a));
        }
    }
}
