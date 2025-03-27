import java.util.Scanner;

public class randomNoGuess {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        double no = Math.random()*10;
        int num = (int) Math.ceil(no);
        // System.out.println(num);

        while(true){
            System.out.println("Guess a number: ");
            int guessed = sc.nextInt();

            if(num > guessed){
                System.out.println("Think a greater no");
            }
            else if(num < guessed){
                System.out.println("Think a smaller no ");
            }
            else{
                System.out.println("Yeah you guessed it right");
                break;
            }
        }
        

    }
}
