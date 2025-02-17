import java.util.Scanner;

public class personCategory{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age<13){
            System.out.println("You are a child");
        }
        else if(age<20 && age>=13){
            System.out.println("You are a teen");
        }
        else if(age<=60 && age>=20){
            System.out.println("You are an Adult");
        }
        else{
            System.out.println("You are a senior citizen");
        }
    }
}