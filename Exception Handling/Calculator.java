import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter you two numbers: ");
        int firsNO = sc.nextInt();
        int secondNo = sc.nextInt();

        try{
            int result = firsNO / secondNo;
            System.out.println("Result is "+result);
        } catch (ArithmeticException e){
            System.out.println("Divide by zero, enter valid values");
        }
    }
}
