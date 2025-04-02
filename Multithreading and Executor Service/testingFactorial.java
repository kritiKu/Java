package Executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class testingFactorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {

            List<Future<Integer>> list = new ArrayList<>();
            for(int i=0; i<10; i++){
                factorialCalculator task = new factorialCalculator(i);
                list.add(service.submit(task));
            }

            for(Future<Integer> futute : list){
                System.out.printf("\n Result is: %d", futute.get());
            }

            service.shutdown();
            if(!service.awaitTermination(10, TimeUnit.SECONDS)){
                System.out.println("BOHOT HUA BS.....");
                service.shutdown();
            }
        } catch (ExecutionException |InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
