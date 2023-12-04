package practice;

import java.util.Stack;

public class StackProblems {
    static void pushBottomOfStack(Stack<Integer> stack, int data){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int popped = stack.pop();
        pushBottomOfStack(stack, data);
        stack.push(popped);
    }


    static String reverseString(String string){
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < string.length()){
            stack.push(string.charAt(index));
            index++;
        }

        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }


    static void reverseStack(Stack<Integer> stack){
        if (stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushBottomOfStack(stack, top);
    }

    static void printStack(Stack<Integer> stack){
        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);

        pushBottomOfStack(stack, 5);

        System.out.println(reverseString("VINAY"));

        Stack<Integer> reverseStack = new Stack<>();
        reverseStack.push(1);
        reverseStack.push(2);
        reverseStack.push(3);

//        printStack(reverseStack);
        reverseStack(reverseStack);
        printStack(reverseStack);


    }
}
