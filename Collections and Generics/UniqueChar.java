import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Character> unique = new HashSet<>();
        System.out.println("Please enter your string");
        String userStr = sc.next();

        for(char ch : userStr.toCharArray()){
           unique.add(ch);
        }
        System.out.printf("Your string has %d unique characters : ", unique.size());
    }
}
