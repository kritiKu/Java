import java.util.List;

public class testingStream {
    public static void main(String[] args) {
        List<String> list = List.of("Kriti", "Shikha", "Sisters");

        list.stream()
                .forEach(lists -> System.out.println(lists));
    }
}
