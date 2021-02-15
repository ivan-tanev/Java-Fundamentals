import org.w3c.dom.ls.LSOutput;

        import java.util.*;

public class Courses {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        Map<String, List<String>> courseStudents = new LinkedHashMap<>();

        String[] input = term.nextLine().split(" : ");

        while (!"end".equals(input[0])){
            String course = input[0];
            String name = input[1];

            if (!courseStudents.containsKey(course)) {
                courseStudents.put(course, new ArrayList<>());
            }
            courseStudents.get(course).add(name);

            input = term.nextLine().split(" : ");
        }
        courseStudents
                .entrySet()
                .stream()
                .sorted((k1, k2) -> Integer.compare(k2.getValue().size(), k1.getValue().size()))
                .forEach(course -> {
                    System.out.println(String.format("%s: %d", course.getKey(), course.getValue().size()));
                    course.getValue()
                            .sort((i1, i2) -> i1.compareTo(i2));
                    course.getValue()
                            .forEach(name -> System.out.println(String.format("-- %s", name)));
                });
    }
}
