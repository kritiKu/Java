import java.util.Scanner;

public class bitwiseXOR{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int firstNo = input.nextInt();
        System.out.println("Please enter the second no: ");
        int secondNo = input.nextInt();

        int result = firstNo^secondNo;
        System.out.println("The result of "+ firstNo + " and " + secondNo+ " is " + result); 
    }
}