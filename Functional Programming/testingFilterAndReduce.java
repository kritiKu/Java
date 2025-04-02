import java.util.List;
import java.util.function.Consumer;

public class testingFilterAndReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Mango", "Banana", "Grapes", "Litchi");


        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
