import java.util.Scanner;

public class reverseArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array: ");
        int no = sc.nextInt();

        int arr[] = new int[no];
        for(int i = 0; i<no; i++){
            System.out.println("Enter the array element no "+ (i+1));
            arr[i] = sc.nextInt();
        }
        reverseArrayElements(arr);

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverseArrayElements(int arr[]){
        int temp=0, b=0;
        for(int i=0; i<arr.length/2; i++){
            b = arr.length -1 -i;
            
            temp = arr[i];
            arr[i] = arr[b];
            arr[b] = temp;

            // System.out.println(arr[i]);
        }
    }
}