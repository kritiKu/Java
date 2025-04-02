public class Counter {
    private int count = 0;
    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

class SynchronizedThread extends Thread{
    private Counter counter;

    public SynchronizedThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for(int i = 0; i< 1000; i++){
            counter.increment();
        }
    }
}
