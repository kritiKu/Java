import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the first no: ");
        int a = input.nextInt();
        System.out.print("Please enter the 2nd no: ");
        int b = input.nextInt();

        System.out.println("Your first no before swap is: "+ a);
        System.out.println("Your second no  before swap is: "+ b);
        temp = a;
        a = b;
        b = temp;

        System.out.println("Your first no after swap is: "+ a);
        System.out.print("Your second no  after swap is: "+ b);
         

    }
}