import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        double firstNo = sc.nextInt();

        System.out.println("Enter the second no: ");
        double secondNo = sc.nextInt();

        System.out.println("Enter the operation which you want to perform(+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        calculaor(firstNo, secondNo, operator);
    }

    public static void calculaor(double a, double b, char op){

        switch(op){
            case  '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b == 0){
                    System.out.println("Division by zero is not allowd");
                }
                else{
                    System.out.println(a/b);
                }
                break;
                
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid operation");
        };
    }
}
