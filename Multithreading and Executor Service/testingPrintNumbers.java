package Executor;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class testingPrintNumbers {
    public static void main(String[] args) {
        ExecutorService execute = Executors.newSingleThreadExecutor();

        Runnable task =new PrintNumbers();

        execute.submit(task);
        execute.shutdown();
    }
}
