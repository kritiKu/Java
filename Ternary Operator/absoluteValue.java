import java.util.Scanner;

public class absoluteValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int no = sc.nextInt();

        int result = (no < 0) ? -no : no;
        System.out.println("The absolute value of the given no is "+result); 
    }    
}
