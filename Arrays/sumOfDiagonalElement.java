import java.util.Scanner;

public class sumOfDiagonalElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows in the array: ");
        int rows = sc.nextInt();

        System.out.println("Enter the no of columns in the array: ");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        
        for(int i=0; i<rows; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Enter the elemnt of rows no "+(i+1)+"column no "+(j+1));
                arr[i][j] = sc.nextInt();

            }
        }
        long result = sumOfDiagonal(arr);
        System.out.println("Thes sum of diagonal elemnets are "+(result));
    }

    public static long sumOfDiagonal(int arr[][]){
        long leftSum = sumofLeftDiagonal(arr);
        long rightSum = sumOfRightDiagonal(arr);

        long sum = leftSum + rightSum;
        if(arr.length % 2 != 0){
            int ind = arr.length / 2;
            sum -= arr[ind][ind];
        }
        return sum;

    }

    public static long sumofLeftDiagonal(int arr[][]){
        long sum = 0;
        int i=0; 
        while(i < arr.length){
            sum += arr[i][i];
            i++;
        }
        return sum;
    }

    public static long sumOfRightDiagonal(int arr[][]){
        long sum =0;
        int i=0;
        while(i<arr.length){
           int col = arr.length - 1 -i;
            sum += arr[i][col];
            i++;
        }
        return sum;
    }
}
