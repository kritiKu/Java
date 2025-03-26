import java.util.Scanner;
public class noOfOccurance {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the element no "+(i+1));
            arr[i] = sc.nextInt();
        } 

        System.out.println("Enter the element for which you wnat to find the no of occurances: ");
        int no = sc.nextInt();

        int result = noOfOccuranceOfElement(arr, no);
        System.out.println("The no of occurances of "+no+" in the array is "+result);
    }

    public static int noOfOccuranceOfElement(int arr[], int elemnt){
        int count = 0;
        for(int number : arr){
            if(number == elemnt){
                count++;
            }
        }
        return count;
    }
}
