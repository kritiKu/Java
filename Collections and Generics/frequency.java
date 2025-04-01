import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class frequency  {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,3));
    }
}
