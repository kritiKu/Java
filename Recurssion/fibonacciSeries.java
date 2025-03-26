import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number till which you want to get the fibbonacci series");
        int no = sc.nextInt();

        System.out.println("Fibonacci Series: ");
        for(int i=1; i<=no; i++){
            System.out.print(fib(i)+" ");
        }
    }

    public static int fib(int n){

        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }
    
}
