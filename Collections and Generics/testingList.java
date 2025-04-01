package Collection;
import java.util.ArrayList;
import java.util.List;

public class testingList {
    public static void main(String[] args){
        List<String> strList = new ArrayList<>();

        //add(E, e) : Appends the specified element
        strList.add("Kriti");

        System.out.println(strList.get(0));

        strList.add("AJ");
        strList.add("Shikha");
        strList.add("Bala");
        strList.add("X");
        strList.add("Y");

        //add(index, element) : insert at specified position
        strList.add( 1, "AJ");
        System.out.println(strList.get(1));

        //remove(o) : remove the first occurrence of the element
        strList.remove("X");

        //remove(int index) : Removes the element at the specified position
        strList.remove(5);

        //size() : returns the no of elements
        System.out.println(strList.size());

        // clear() : Removes all of the element
        //contains(o) : return true if it contains the object
        System.out.println(strList.contains("AJ"));

        for (String s : strList) {
            System.out.println(s);
        }
    }
}
