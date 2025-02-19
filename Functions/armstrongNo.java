import java.util.Scanner;

public class armstrongNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no: ");
        int a = sc.nextInt();
        armstrong(a); 
    }
    public static void armstrong(int n){
        double sum=0;
        int x = 0;
        int temp1 = n;
        int temp2 = n;
        int count=0;
        while(temp1>0){
            // x=temp1%10;
            temp1/=10;
            count++;
        }
        // System.out.println(count);
        while(temp2>0){
            x = temp2%10;
            sum += Math.pow(x, count);
            temp2/=10;
            // System.out.println(sum);
        }
        if(sum==n){
            System.out.println("Armstrong No");
        }
        else{
            System.out.println("Not an armstrong No");
        }
        
    }

}