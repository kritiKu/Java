import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwaptArrayElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 7, 9);
        System.out.println(list);
        swap(list, 1, 2);
        System.out.println(list);
    }
    public static void swap(List<Integer> list, int a, int b){
        int swap = list.get(a);
        list.set(a, list.get(b));
        list.set(b, swap);
    }
}
