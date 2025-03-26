import java.util.Scanner;

public class sumOfPositiveNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the array element no "+(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Sum of all positive no is "+sumOfPositiveNoInArray(arr));
    }

    public static int sumOfPositiveNoInArray(int arr[]){
        int sum =0;
        for(int num : arr){
            if(num < 0){
                continue;
            }
            else{
                sum+=num;
            }
        }
        return sum;
    }
}
