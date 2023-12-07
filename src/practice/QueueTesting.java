package practice;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTesting {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(); // ArrayDeque vs LinkedList
        Queue<Integer> arrayQueue = new ArrayDeque<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        arrayQueue.add(1);
        arrayQueue.add(2);
        arrayQueue.add(3);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }

        while (!arrayQueue.isEmpty()){
            System.out.println(arrayQueue.peek());
            arrayQueue.remove();
        }

    }
}
