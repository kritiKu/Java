// package if_else;
import java.util.Scanner;

public class oddEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a no: ");
        int a = input.nextInt();
        if(a%2==0){
            System.out.println("Even no");
        }
        else{
            System.out.println("Odd no");
        }
    }
    
}
