package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class PrinterQueueTest {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();

        queue.offer("문서1");
        queue.offer("문서2");
        queue.offer("문서3");

        System.out.println("출력: " + queue.poll());
        System.out.println("출력: " + queue.poll());
        System.out.println("출력: " + queue.poll());
    }
}
