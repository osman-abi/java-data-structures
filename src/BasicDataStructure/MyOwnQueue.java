package BasicDataStructure;

public class MyOwnQueue {
    /**
     * Methods: enqueue, dequeue, peek, isEmpty, isFull
     */
    private final int[] array;
    private int front;
    private int rear;

    public MyOwnQueue(int capacity){
        this.array = new int[capacity];
        this.front = 0;
        this.rear = 0;
    }

    public void enqueue(int data){
        if(rear == array.length){
            throw new RuntimeException("Queue is full");
        }
        array[rear] = data;
        rear ++;
    }

    public int dequeue(){
        if (front == rear) {
            throw new RuntimeException("Queue is empty");
        }
        int index = array[front];
        front ++;
        return index;
    }

    public int peek(){
        if (front == rear) {
            throw new RuntimeException("Queue is empty");
        }
        return array[front];
    }

    public void clear(){
        front = 0;
        rear = 0;
    }

    public int size(){
        return rear - front;
    }

    public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return rear == array.length;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = front; i < rear; i++) {
            sb.append(array[i]);
            if(i < rear - 1){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }



}
