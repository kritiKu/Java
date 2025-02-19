import java.util.Scanner;

public class palindromeNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a = sc.nextInt();
        palindrome(a);
    }

    public static void palindrome(int n){
        int x = 0;
        int temp=n;
        while(n>0){
            int digit = n%10;
            x = x*10 + digit;
            // System.out.print(x);
            n/=10;
        }
        
        if(x==temp){
            System.out.println("Palindrome No");
        }
        else{
            System.out.println("Not a palindrome No");
        }
    }
}