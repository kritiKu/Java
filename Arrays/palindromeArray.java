import java.util.Scanner;

public class palindromeArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();

        int arr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the array element no "+(i+1));
            arr[i] = sc.nextInt();
        }

        int value =palindromeArray(arr);
        if(value==1){
            System.out.println("The array is palindrome");
        }
        else{
            System.out.println("The array is not palindrome");
        }
    }

    public static int palindromeArray(int arr[]){
        int j=0;
        for(int i=0; i<arr.length/2; i++){
            j = (arr.length - 1) - i;
            if(arr[i] == arr[j]){
                return 1;
            }
        }
        return 0;
    }
}
