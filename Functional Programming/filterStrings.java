import java.util.List;

public class filterStrings {
    public static void main(String[] args) {
        List<String> list = List.of("Shikha is my sister", "Kriti", "Abhinav is my brother");

        String result = list.stream()
                .filter(lists -> lists.length()>10)
                .reduce("", (a, b) -> a + " "+b);

        System.out.println(result);
    }
}
