import java.util.Scanner;
public class breakCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter any string: ");
            String input = sc.next();
            if(input.equals("exit")){
                break;
            }
        }
        System.out.println("You have successfully exited.");
       
    }

    
}
