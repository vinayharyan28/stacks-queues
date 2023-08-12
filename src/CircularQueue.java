public class CircularQueue {
    protected int DEFAULT_SIZE=10;
    protected int[] data;
    protected int front=0, end=0, size=0;
    public CircularQueue(){
        this.data = new int[DEFAULT_SIZE];
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void insert(int value) throws Exception{
        if (isFull()){
            throw new Exception("queue is full");
        }

        data[end++] = value;
        end = end % data.length;
        size++;
    }

    public void remove() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is full");
        }
        front++;
        size--;
        front = front % data.length;
    }

    public int getFront() throws Exception{
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }

        return data[front];
    }

    public void display() throws Exception{
       if(isEmpty()){
           throw new Exception("empty queue");
       }
       int i=front;
       do{
           System.out.print(data[i] + " -> ");
           i++;
           i%=data.length;
       }while (i != end);
       System.out.println("end");
    }

    public static void main(String[] args) throws Exception{
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        circularQueue.insert(4);
        circularQueue.insert(5);
        circularQueue.remove();
        circularQueue.insert(6);
        circularQueue.display();
        System.out.println();
        System.out.println(circularQueue.getFront());

    }

}