import java.util.List;

public class filterOddNo {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 2, 4, 5, 7, 8);

        list.stream()
                .filter(num -> (num % 2 != 0))
                .forEach(num -> System.out.println(num));
    }
}
