import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class reverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        System.out.println(list);
        reverse(list);
        System.out.println(list);
    }

    public static void reverse(List<Integer> list){
        Collections.reverse(list);
    }
}
