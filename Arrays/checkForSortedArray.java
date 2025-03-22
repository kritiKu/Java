import java.util.Scanner;
public class checkForSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.println("Enter the array element "+(i+1));
            arr[i] = sc.nextInt();
        }
        int x = sortedAsc(arr);
        if(x == 1){
            System.out.println("The given array is sorted");
        }
        else{
            System.out.println("The given array is not sorted");
        }
       

    }
    public static int sortedAsc(int a[]){
        int element = a[0];
        int i =0;
        int flag = 0;
        while(i<a.length){
            if(a[i]>=element){
                flag = 1;
            }
            else if(a[i]<=element){
                flag = 1;
            }
            else{
                flag = 0;
            }
            i++;
        }
        return flag;
    }

    
}