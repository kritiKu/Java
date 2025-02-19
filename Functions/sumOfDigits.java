import java.util.Scanner;

public class sumOfDigits{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("plaese enter a no: ");
        int a = sc.nextInt();
        System.out.println(sumDigits(a));
    }
    public static int sumDigits(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}