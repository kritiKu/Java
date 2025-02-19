import java.util.Scanner;

public class reverseANo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a no: ");
        int a = sc.nextInt();
        reverseNo(a);
    }
    public static void reverseNo(int n){
        int x = 0;
        while(n>0){
            int digit = n%10;
            x = x*10 + digit;
            n/=10;
        }
        System.out.print(x);
    }
}