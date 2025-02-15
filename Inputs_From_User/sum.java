import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 1st no: ");
        int a = input.nextInt();
        System.out.println("Please enter 2nd no: ");
        int b = input.nextInt();
        int Sum = a+b;
        System.out.println("Sum of two no's is "+ Sum);
    }
}
