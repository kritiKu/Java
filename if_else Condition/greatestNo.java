
import java.util.Scanner;
public class greatestNo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1st no: ");
        int a = input.nextInt();
        System.out.println("Please enter 2nd no: ");
        int b = input.nextInt();
        System.out.println("Please enter 3rd no: ");
        int c = input.nextInt();

        if(a>=b && a>=c){
            System.out.println(a + " is greatest");
        }
        else if(b>=a && b>=c){
            System.out.println(b+ " is greatest");
        }
        else{
            System.out.println(c + " is greatest");
        }

    }
    
}
