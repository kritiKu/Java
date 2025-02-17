import java.util.Scanner;

public class positive_neg_zero{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a no: ");
        int a = input.nextInt();
        if(a>0){
            System.out.println("Positive no");
        }
        else if(a<0){
            System.out.println("Negative no");
        }
        else{
            System.out.println("Zero");
        }
    }
    
}