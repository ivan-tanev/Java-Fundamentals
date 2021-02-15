import java.util.*;

public class Student_Academy {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);

        int n = Integer.parseInt(term.nextLine());
        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = term.nextLine();
            double grade = Double.parseDouble(term.nextLine());

            if (!students.containsKey(name)){
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        students
                .entrySet()
                .stream()
                .filter(student -> student.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.5)
                .sorted((s1, s2) -> {
                    double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(second, first);
                })
                .forEach(student -> System.out.println(String.format("%s -> %.2f",
                        student.getKey(),
                        student.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble())));
    }
}
