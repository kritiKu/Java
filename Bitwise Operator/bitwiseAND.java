import java.util.Scanner;

public class bitwiseAND{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 1st no: ");
        int firstNo = input.nextInt();
        System.out.println("Please enter the second no: ");
        int secondNo = input.nextInt();

        int result = firstNo & secondNo;
        System.out.println("The bitwise and of " + firstNo + " and " +secondNo +"is " + result);

    }
}