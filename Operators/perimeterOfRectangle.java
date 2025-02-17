import java.util.Scanner;
public class perimeterOfRectangle {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the length of the rectangle: ");
    int length = input.nextInt();

    System.out.println("Please enter the breadth of the rectangle: ");
    int breadth = input.nextInt();

    System.out.println("The perimeter of the rectangle is: "+ (2*(length+breadth)));
    }
    
}
