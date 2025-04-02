package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExecutorService {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i=0; i<10; i++){
            SleepTask task = new SleepTask();
            service.submit(task);
        }
        service.shutdown();
    }
}
