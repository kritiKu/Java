package Runnable;

public class testingRunnables {
    public static void main(String[] args) {
        printTask p1 = new printTask('*');
        printTask p2 = new printTask('#');

        Thread t1 = new Thread(p1);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.start();

    }
}
