package in.KGCoding.Inheritance;

public class testArray {
    public static void main(String[] args) {
        ArrayOperation arr = new ArrayOperation(new int[] {1,3,5,7,9});
        ArrayOperation.Statistics statistics = arr.new Statistics();
        System.out.println(statistics.mean());
    }
}
