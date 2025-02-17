import java.util.Scanner;

public class simpleInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float a = input.nextFloat();
        System.out.println("Enter the rate of interest: ");
        float b = input.nextFloat();
        System.out.println("Enter the time: ");
        int c = input.nextInt();

        float SI = (a*b*c)/100;
        System.out.println("Simple Interest is : " + SI);
    }
}