import java.util.Scanner;
public class array{
    public static void main(String[] args){
       //int[] myArray = new int[5]; //Declaration
        int[] myArray = {98, 2, 56, 89, 17};
        
        //Array traversal
        for(int i =0; i<myArray.length; i++){
            System.out.println(myArray[i]);
        }

        //Array Searching
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the element you want to search ");
        int a = sc.nextInt();

        for(int i=0; i<myArray.length; i++){
            if(myArray[i] == a){
                System.out.println("Element found at index "+i);
                break;
            }
            
        }
       
    }
}