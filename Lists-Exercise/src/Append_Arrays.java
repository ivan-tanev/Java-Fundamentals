import java.util.*;

public class Append_Arrays {
    public static void main(String[] args) {

        Scanner term = new Scanner(System.in);
        String[] input = term.nextLine().split("\\|");
        List<String> one = new ArrayList<>();

        for (int i = input.length - 1; i >= 0; i--) {
            String[] temp = input[i].split("\\s+");
            for (String s : temp) {
                if (!"".equals(s)) {
                    one.add(s);
                }
            }
        }

        System.out.print(String.join(" ", one));
    }
}
