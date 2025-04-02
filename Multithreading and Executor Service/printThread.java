public class printThread extends Thread{

    @Override
    public void run(){
        System.out.printf("%s Thread Starting -%d\n", Thread.currentThread().getName(), threadInt);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread Ended-%d\n",Thread.currentThread().getName(), threadInt);
    }

    public final int threadInt;

    public printThread(int threadInt){
        this.threadInt = threadInt;
    }

}


