import java.util.Scanner;

public class minNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no: ");
        int firstNo = sc.nextInt();

        System.out.println("Enter the second no: ");
        int secondNo = sc.nextInt();

        int minNo = firstNo < secondNo ? firstNo : secondNo;
        System.out.println("The minimum no is "+minNo);
    }
}
