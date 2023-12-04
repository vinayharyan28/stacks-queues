package stack;

public class StackTest {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int pointer = -1;
    public StackTest(int size){
        this.data = new int[size];
    }

    public StackTest(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return pointer == data.length;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }

    public boolean push(int item){
        if (isFull()){
            return false;
        }
        pointer++;
        data[pointer] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        int removed = data[pointer];
        pointer--;
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot peek from an empty stack!!");
        }
        return data[pointer];
    }

    public static void main(String[] args) throws Exception {
        StackTest stackTest = new StackTest(5);
        stackTest.push(1);
        stackTest.push(2);
        stackTest.push(3);
        stackTest.push(4);
        stackTest.push(5);
//        stackTest.push(6);
        System.out.println(stackTest.pop());
    }
}
