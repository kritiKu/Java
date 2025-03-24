
import java.util.Scanner;
public class monthName {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int no = sc.nextInt();
        month(no);

    }
    
    public static void month(int number){
        String monthNo  = switch(number){
            case 1 -> "January";
            case 2 -> "Februray";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12-> "December";
            default -> "Invalid";

        };
        System.out.println(monthNo);

    }
    
}
