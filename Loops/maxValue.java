import java.util.Scanner;
public class maxValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter the array element no "+(i+1));
            arr[i] = sc.nextInt();
        }

        int result = maxValueInArray(arr);
        System.out.println("The maximum value in the array is "+result);
    }
    // public static int maxValueInArray(int arr[]){
    //     int maxValue = 0;
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]> maxValue){
    //             maxValue = arr[i];
    //         }
    //     }
    //     return maxValue;
    // }

    public static int maxValueInArray(int arr[]){
        int maxNo = Integer.MIN_VALUE;
        for(int no : arr){
            if(no > maxNo){
                maxNo = no;
            }
        }
        return maxNo;
    }
}
