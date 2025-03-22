import java.util.Scanner;

public class maxMinElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        if(size == 0){
            System.out.println("Finding min & max is not possile");
        }
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            System.out.println("Enter the array element "+(i+1));
            arr[i] = sc.nextInt();
        }
        minMax(arr);
    }
    public static void minMax(int a[]){
        int min=a[0], max = a[0], i=0;
        while(i<a.length){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]> max){
                max = a[i];
            }
            i++;
        }
        System.out.println("The min element in the array is: "+min);
        System.out.println("The max element in the array is: "+max);
    }
}