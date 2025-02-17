import java.util.Scanner;

public class grades{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your marks: ");
        float marks = input.nextFloat();
        if(marks>90){
            System.out.println("Your grade is A");
        }
        else if(marks>75 && marks<=90){
            System.out.println("Yoir garde is B");
        }
        else if(marks>60 && marks<=75){
            System.out.println("Your grade is C");
        }
        else if (marks>30 && marks<=60){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("Your grade is F");
        }
    }
}