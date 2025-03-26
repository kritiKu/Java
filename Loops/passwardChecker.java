import java.util.Scanner;

public class passwardChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String passward;
        do{
            System.out.println("Enter your passward: ");
            passward = sc.next();
        }while(!isValidPassward(passward));
        System.out.println("Thanks for entering a valid passward: ");
    }

    public static boolean isValidPassward(String passward){
        return passward.length() > 6;
    }
}
