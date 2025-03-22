import java.util.Scanner;

public class sumAverage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int size = input.nextInt();
        int[] nums = new int[size];
        
        for(int i=0; i<size; i++){
            System.out.println("Enter the element no "+(i+1)+" : ");
            nums[i] = input.nextInt();
            // i++;
        }
        long sum = sum(nums);
        int avg = average(nums);
        System .out.println("The sum of the elements of array is : "+sum);
        System.out.println("The avg of the array elements is: "+avg);
    }

    public static long sum(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        return sum;
    }
    public static int average(int[] nums){
        // int sum=0;
        // int avg=0;
        // for(int i=0; i<nums.length; i++){
        //     sum+=nums[i];
        // }
        // avg = sum/n;
        long sum = sum(nums);
        int avg = (int)sum/nums.length;
        return avg;
    }
}