import java.util.HashSet;
import java.util.Set;

public class testSet {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("Orange");
        set.add("Mango");
        set.add("Grapes");
        set.add("Banana");
        set.add("Apple");


        for(String element : set){
            System.out.printf("%s  ", element);
        }

        boolean isAdded = set.add("Apple");
        boolean isThere = set.contains("Banana");
        System.out.println(isAdded);
        System.out.println(isThere);
    }
}
