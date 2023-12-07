package practice;

import java.util.Arrays;
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

    static void stockSpan(int[] stocks, int[] span){
        Stack<Integer> stack = new Stack<>();
        span[0] = 1;
        stack.push(0);

        for(int i=1; i<stocks.length; i++){
            int currentPrice = stocks[i];
            while (!stack.isEmpty() && currentPrice > stocks[stack.peek()]){
                stack.pop();
            }
            if (stack.isEmpty()){
                span[i] = i+1;
            }else {
                int prevHigh = stack.peek();
                span[i] = i - prevHigh;
            }

            stack.push(i);
        }
    }

    static boolean validParenthesis(String string){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            //Opening
            if (ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                // Closing
                if(stack.isEmpty()){
                    return false;
                }
                if ((stack.peek() == '(' && ch == ')') || (stack.peek() == '{' && ch == '}') || (stack.peek() == '[' && ch == ']')){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

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
        int[] stocks = {100, 80, 60, 70, 60, 85, 100};
        int[] span = new int[stocks.length];
        stockSpan(stocks, span);
        System.out.println(Arrays.toString(span));
        System.out.println(validParenthesis("((((()))))"));


    }
}
