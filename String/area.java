import java.util.Scanner;

public class area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        int radius = sc.nextInt();

        double resultArea = areaOfCircle(radius);
        double resultCircumference = circumferenceOfCircle(radius);

        System.out.println("The area of the circle is "+resultArea);
        System.out.println("The circumference of the circle is "+resultCircumference);

    }

    public static double areaOfCircle(int radius){
        return Math.PI*radius*radius;
    }

    public static double circumferenceOfCircle(int radius){
        return 2*(Math.PI)*radius;
    }
    
}
