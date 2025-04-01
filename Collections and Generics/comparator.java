import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class comparator{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear", "Lion","Ant");

        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);
    }
    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
}