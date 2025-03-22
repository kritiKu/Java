import java.util.Scanner;

public class searchIn2DArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows in array: ");
        int rows = sc.nextInt();

        System.out.println("Enter the no of columns in the array:");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];

        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.println("Enter the elemnts row no "+(i+1)+" column no "+(j+1));
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elemnet to search");
        int element = sc.nextInt();

        int result = search(arr, element);

        if(result == 1){
            System.out.println("Element found in the array");
        }
        else{
            System.out.println("Element not found");
        }
    }

    public static int search(int arr[][], int element){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == element){
                    return 1;
                }
            }
        }

        return 0;
    }
}
