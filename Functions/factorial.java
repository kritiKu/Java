import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the no for which you want to find the factorial: ");
        int a = sc.nextInt();
        int f = fact(a);
        System.out.println("Factorial of "+ a+" is "+ f);
    }

    // Using recurssion
    // public static int fact(int n){

    //     if (n==0 || n==1)
    //     return 1;
    //     else
    //     return n * fact(n-1);
    // }

    public static int fact(int n){
        int factorial = 1;
        if(n==0){
            return 1;
        }
        else{
            for(int i=1; i<=n; i++){
            factorial *= i;
            }
        }
        return factorial;
    }
}