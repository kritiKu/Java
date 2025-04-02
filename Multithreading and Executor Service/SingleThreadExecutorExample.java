package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args){

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable task = new PrintRunnable('*');

        executor.submit(task);
        executor.shutdown();
    }
}
