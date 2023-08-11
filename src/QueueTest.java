public class QueueTest {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public QueueTest(int size){
        this.data = new int[size];
    }

    public QueueTest(){
        this(DEFAULT_SIZE);
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        // Shift the element to left
        for (int i=1; i<end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display(){
        for (int i=0; i<end; i++){
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) throws Exception{
        QueueTest queueTest = new QueueTest(5);
        queueTest.insert(1);
        queueTest.insert(2);
        queueTest.insert(3);
        queueTest.insert(4);
        queueTest.remove();
        queueTest.display();

    }

}
