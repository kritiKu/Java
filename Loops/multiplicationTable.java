import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for which you want to print the multiplucation table:");
        int no = sc.nextInt();
        multiplicationTableOfNo(no);

    }  

    public static void multiplicationTableOfNo(int no){
        System.out.println("Your multiplication table for "+ no+ "is ");
        for(int i=1; i<=10; i++){
            System.out.println(no+" x "+i+" = "+no*i);
        }
    }
}
