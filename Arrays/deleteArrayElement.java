import java.util.Scanner;

public class deleteArrayElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i =0; i<size; i++){
            System.out.println("Enter the array element no "+(i+1));
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Enter the element you want to delete");
        int x = sc.nextInt();
        deleteElement(arr, x);
        

    }
    public static void deleteElement(int a[], int element){
        int i;

        for(i=0; i<a.length; i++){
            if(a[i] == element){
                continue;
            }
            System.out.print(a[i]+" ");
        }
        }
        
        
    }


