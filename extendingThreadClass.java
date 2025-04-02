package threadClass;

public class extendingThreadClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        firstTask t1 = new firstTask();
        secondTask t2 = new secondTask();

        t1.start();
        t2.start();

        long endTime = System.currentTimeMillis();
        System.out.println("Total time taken: "+(endTime - startTime));
    }
}
