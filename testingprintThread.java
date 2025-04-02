public class testingprintThread {
    public static void main(String[] args) throws InterruptedException {
        printThread p1 = new printThread(1);
        printThread p2 = new printThread(2);
        printThread p3 = new printThread(3);

        p1.start();
        p1.join();
        p2.start();
        p2.join();
        p3.start();
    }

}
