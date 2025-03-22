import java.util.Scanner;

public class sumAvgof2DArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of rows in the array");
        int rows = sc.nextInt();

        System.out.println("Enter the no of columns in the array");
        int columns = sc.nextInt();

        int arr[][] = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                System.out.println("Enter the elemnt of rows no "+(i+1)+"column no "+(j+1));
                arr[i][j] = sc.nextInt();
            }

        }
        SumAvg(arr);
    }

    public static void SumAvg(int arr[][]){
        int sum=0;
        double count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
                count++;
            }
        }
        System.out.println("Sum of the elements are "+sum);
        double avg = sum/count;
        System.out.println("Avg = "+avg);
    }
}