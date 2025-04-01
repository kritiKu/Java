import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class testMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Orange", 20);
        map.put("Banana", 30);
        map.put("Grapes", 40);
        map.put("Mango", 50);


        //Accessing a value
        Integer appleCount = map.get("Apple");
        System.out.println("Apples count: "+appleCount);

        //Checking if a key exist
        if(map.containsKey("Banana")){
            System.out.println("Banana is in the map");
        }

//        System.out.println(map.containsKey("Orange"));

//        map.put("Orange", 20);
        //Remove
//        System.out.println(map.remove("Orange"));
        System.out.println(map.size());

        for(String key: map.keySet()){
            System.out.printf("%s : %s \n", key, map.get(key));
        }
    }
}
