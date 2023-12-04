package practice;

public class StackLinkedListImplementation {
    static private class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head;
    static int size;

    boolean isEmpty(){
        return head == null;
    }

    void push(int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            head = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    int pop(){
        if (isEmpty()){
            return -1;
        }

        int top = head.data;
        head = head.next;
        return top;
    }

    int peek(){
        if (isEmpty()){
            return -1;
        }

        return head.data;
    }

    public static void main(String[] args) {
        StackLinkedListImplementation stackLinkedList = new StackLinkedListImplementation();
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        System.out.println(stackLinkedList.peek());
        System.out.println(stackLinkedList.pop());
    }
}
