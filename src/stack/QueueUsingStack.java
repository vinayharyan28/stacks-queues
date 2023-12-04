package stack;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> first, second;

    public QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();

        while (!second.isEmpty()){
            first.push(second.pop());
        }

        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    // Leet code

}
