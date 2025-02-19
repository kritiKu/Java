import java.util.Scanner;

public class sumOfOddNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a no to which you want to find the sum: ");
        int a = sc.nextInt();
        SumOfOddNo(a);
    }

    public static void SumOfOddNo(int a){
        int sum = 0;
        for(int i=1; i<=a; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("Sum of odd no till " + a+ " is "+ sum);
    }
}