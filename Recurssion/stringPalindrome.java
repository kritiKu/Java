import java.util.Scanner;
public class stringPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = sc.next();
        int result = stringPalindrome(input);
        if(result == 1){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a palindrome String");
        }

    }

    public static int stringPalindrome(String input){

        if(input.length() <=1){
            return 1;
        }
        int lastPos = input.length()-1;
        if(input.charAt(0) != input.charAt(lastPos)){
            return 0;
        }
        String newStr = input.substring(1, lastPos);
        return stringPalindrome(newStr);
    }
}
