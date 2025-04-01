import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args){
        printMany("Kriti", "Shikha", "Babu");
        printMany("Papa", "Mummy");
        printMany("Kriti", "AJ");
    }

    public static void printMany(String... many){
        for(String str : many){
            System.out.println(str);
        }
    }
}
