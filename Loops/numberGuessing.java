import java.util.Scanner;

public class numberGuessing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = 7;
        int number;
        do{
            System.out.println("Enter a  no between 1 to 10 ");
            number = sc.nextInt();

            if(number > n){
                System.out.println("Think a smaller number");
            }
            else if(number < n){
                System.out.println("Think a greater number");
            }
            else{
                System.out.println("Yeah you guessed the right no");
            }
        }while(n != number);
    }
}
