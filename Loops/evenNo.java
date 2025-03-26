import java.util.Scanner;
public class evenNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no till where you want to print the even no: ");
        int no = sc.nextInt();

        System.out.println("Even numbers are: ");

        for(int i=0; i<=no; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
