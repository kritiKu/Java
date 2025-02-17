import java.util.Scanner;

public class bitwiseComplement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a no: ");
        int firstNo = input.nextInt();

        int result = ~firstNo;
        System.out.println("The complement of " +firstNo+ " is " + result); 
    }
}