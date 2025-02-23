package BasicDataStructure;

public class MyOwnStack {
    private final int[] array;
    private int top;
    private final int capacity;

    public MyOwnStack(int capacity){
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = 0;
    }

    public void push(int data){
        if(top == capacity){
            throw new RuntimeException("Stack is full");
        }
        array[top] = data;
        top++;
    }

    public int pop(){
        int index;
        if(top == 0){
            throw new RuntimeException("Stack is empty");
        }
        index = array[top-1];
        top--;
        return index;
    }

    public int peek(){
        if(top == 0){
            throw new RuntimeException("Stack is empty");
        }
        return array[top-1];
    }

    public void clear(){
        top = 0;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public boolean isFull(){
        return top == capacity;
    }

}
