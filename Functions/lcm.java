import java.util.Scanner;

public class lcm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first no: ");
        int firstNo = sc.nextInt();
        System.out.println("Please enter the 2nd no: ");
        int secondNo = sc.nextInt();
        lcmOfNo(firstNo,secondNo);
       

    }
    public static void lcmOfNo(int a, int b){
        int prod = a*b;
        for(int i=1; i<=prod; i++){
            int x = a*i;
            if(x%b==0){
                System.out.println("LCM of "+a+ " & "+b+" is "+x);
                break;
            }
        }
    } 
}