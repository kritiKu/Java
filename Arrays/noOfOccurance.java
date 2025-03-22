import java.util.Scanner;

public class noOfOccurance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the no of elements in the array:");
        int a = input.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the element no "+(i+1));
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the element for which you want to find the occurances");
        int n = input.nextInt();
        int no = noOfOccuranceOfElement(arr, n);
        System.out.println("Element "+n+" occured "+no+" times in the array");
    }

    public static int noOfOccuranceOfElement(int a[], int n){
        int count = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == n){
                count++;
            }
        }
        return count;
    }
}