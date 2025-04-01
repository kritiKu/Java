package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class testingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.printf("Head of the queue is %s", queue.peek());
        System.out.println();
        for (Integer num : queue) {
            System.out.println(num);
        }
    }
}
