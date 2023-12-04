package stack;

public class DynamicStack extends StackTest{
    public DynamicStack(){
        super(); // it will call stack.StackTest
    }

    public DynamicStack(int size){
        super(size); // it will call stack.StackTest(int size)
    }

    @Override
    public boolean push(int item){
        if (isFull()){
            //double the array size
            int[] temp = new int[data.length + 2];

            // copy all previous items in new data;
            for (int i=0; i<data.length; i++){
                temp[i] = data[i];
            }
        }

        return super.push(item);
    }


    public static void main(String[] args) throws Exception{
        DynamicStack dynamicStack = new DynamicStack(10);
        dynamicStack.push(1);
        dynamicStack.push(2);
        dynamicStack.push(3);
        dynamicStack.push(4);
        dynamicStack.push(5);
        dynamicStack.push(6);
        System.out.println(dynamicStack.pop());
    }


}
