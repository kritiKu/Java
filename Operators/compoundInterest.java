import java.util.Scanner;

public class compoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the principle amount: ");
        int p = input.nextInt();
        System.out.println("Please enter the rate of interest: ");
        float r = input.nextFloat();
        System.out.println("Please enter the time: ");
        int t = input.nextInt();    
        double CI = p* Math.pow((1 + r/100),t);
        System.out.println("Compound Interest is : "+CI);
    }
}
