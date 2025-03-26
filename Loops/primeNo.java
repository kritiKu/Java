import java.util.Scanner;
public class primeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no to check if it is prime or not ");
        int number = sc.nextInt();
        primeNumber(number);
    }

    public static void primeNumber(int number){
        int count = 0;
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Prime no ");
        }
        else{
            System.out.println("Not a prime no");
        }
    }
    
}
