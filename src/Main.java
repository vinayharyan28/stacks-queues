import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        System.out.println(stack.pop());

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue);
        System.out.println(queue.poll());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(10);
        deque.add(11);
        deque.add(12);
        deque.addFirst(13);
        System.out.println(deque);


    }
}