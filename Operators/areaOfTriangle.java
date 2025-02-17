import java.util.Scanner;

public class areaOfTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle: ");
        float a = input.nextFloat();
        System.out.println("Please enter the breadth of the triangle: ");
        float b = input.nextFloat();

        float area = 0.5f *(a*b);
        System.out.println("Area =  "+ area);
    }
}