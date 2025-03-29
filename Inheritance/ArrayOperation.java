package in.KGCoding.Inheritance;

public class ArrayOperation {
    int[] arr;

    public ArrayOperation(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{

        double mean(){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum+= arr[i];
            }
            int mean = sum / arr.length;
            return mean;
        }
        

    }
}
