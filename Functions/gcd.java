import java.util.Scanner;

public class gcd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first no: ");
        int firstNo = sc.nextInt();
        System.out.println("Please enter the second No: ");
        int secondNo = sc.nextInt();
        int gcd = gcdOfNo(firstNo,secondNo);
        System.out.println("Gcd of "+firstNo+" & "+secondNo+" is "+gcd);
    }

    public static int gcdOfNo(int a, int b){
        int gcd = 1;
        int i=2;
        int least = least(a, b); 
        while(i<=least){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
            i++;
        }
        return gcd;
    }
    public static int least(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
}