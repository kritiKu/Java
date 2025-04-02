import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 2, 5, 6, 3);


//        int newSum = numbers.stream()
//                .reduce(0, new BinaryOperator<Integer>() {
//                    @Override
//                    public Integer apply(Integer integer, Integer integer2) {
//                        return integer + integer2;
//                    }
//                });

        int newSum = numbers.stream()
                .reduce(0, (a, b) -> a+b);

        System.out.println(newSum);

        int max = numbers.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a:b);
        System.out.println(max);

    }
}
