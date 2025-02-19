import java.util.Scanner;

public class sum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st no:");
        int a = input.nextInt();
        System.out.println("Enter the 2nd no:");
        int b = input.nextInt();

        int result = sum(a, b);
        System.out.println(result);

    }
    public static int sum(int x, int y){
        return x+y;
    }

}

