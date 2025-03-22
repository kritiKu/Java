import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1 = sc.nextInt();
        
        
        int arr1[] = new int[size1];
        System.out.println("Enter the elemnets of first array");
        for(int i=0; i<size1; i++){
            System.out.println("Enter the elemnet no "+(i+1));
            arr1[i] = sc.nextInt(); 
        }

        System.out.println("Enter the size of the second array");
        int size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the elements of 2nd array");
        for(int i=0; i<size2; i++){
            System.out.println("Enter the elemnet no "+(i+1));
            arr2[i] = sc.nextInt();
        } 

        int size3 = size1 + size2;
        int result[] = merge(arr1, arr2);

        System.out.println("The merged array is: ");
        for(int i=0; i<size3; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] merge(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int newArr[] = new int[newSize];
        
        int i=0, j=0, k=0;
        while(i<arr1.length || j<arr2.length){
            if(j == arr2.length ||(i<arr1.length && arr1[i]< arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArr;
    }
    
}
