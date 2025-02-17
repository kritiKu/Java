import java.util.Scanner;
public class fahrenheitToCelsius {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fahrenheit value: ");
        float f = input.nextFloat();

        float celcius = (f - 32)* 5/9;
        System.out.println("Celcius value is: "+ celcius);
    }
}
