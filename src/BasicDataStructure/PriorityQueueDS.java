package BasicDataStructure;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDS {
    /**
     * Priority Queue is an extension of the queue with following properties.
     * 1. Every item has a priority associated with it.
     * 2. An element with high priority is dequeued before an element with low priority.
     * 3. If two elements have the same priority, they are served according to their order in the queue.
     * #1 insert: O(log n)
     * #2 getHighestPriority: O(1)
     * #3 removeHighestPriority: O(log n)
     */

    int[] array;
    Queue<Integer> priorityQueue;

    public PriorityQueueDS(int[] array) {
        this.array = array;
        this.priorityQueue = new PriorityQueue<>();
    }


    public Queue<Integer> insert(){
        for (int element : array) {
            priorityQueue.offer(element);
        }
        return priorityQueue;
    }

    public int getHighestPriority() {
        Integer top = priorityQueue.peek();
        return (top != null) ? top : -1;
    }

    public int removeHighestPriority() throws NullPointerException {
        Integer response = priorityQueue.poll();
        return (response != null) ? response : -1;
    }
}
