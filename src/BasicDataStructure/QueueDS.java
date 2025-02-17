package BasicDataStructure;
import java.util.Queue;
import java.util.LinkedList;

public class QueueDS {
    /**
     * Queue is a linear data structure which follows a particular order in which the operations are performed.
     * FIFO: First In First Out (which means store objects like horizontal line)
     * #1 Enqueue: Add an item to the queue. If the queue is full, then it is said to be an Overflow condition. (offer)
     * #2 Dequeue: Remove an item from the queue. The items are popped in the same order in which they are pushed. (poll)
     * #3 Front: Get the front item from the queue. (peek)
     */

    String[] array;
    Queue<String> queue;

    public QueueDS(String[] array) {
        this.array = array;
        this.queue = new LinkedList<>();
    }

    public Queue<String> addElements(){
        for (String element : array) {
            queue.offer(element);
        }
        return queue;
    }

    public Queue<String> removeElement(){
        queue.poll();
        return queue;
    }

    public String frontElement(){
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
