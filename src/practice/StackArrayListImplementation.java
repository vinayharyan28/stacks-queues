package practice;
import org.w3c.dom.Node;

import java.util.ArrayList;

public class StackArrayListImplementation {
    static ArrayList<Integer> list = new ArrayList<>();

    boolean isEmpty(){
        return list.isEmpty();
    }

    void push(int data){
        list.add(data);
    }

    int pop(){
        if (isEmpty()){
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    int peek(){
        if (isEmpty()){
            return -1;
        }
        return list.get(list.size() - 1);
    }


    public static void main(String[] args) {
        StackArrayListImplementation stack = new StackArrayListImplementation();
        System.out.println(stack.peek());

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }




}
