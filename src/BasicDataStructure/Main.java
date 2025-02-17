package BasicDataStructure;

import java.util.ArrayList;

/**
 * This is the main class for the BasicDataStructure package.
 * Data structure can be used to store and organize data in a computer so that it can be used efficiently.
 */

public class Main {
    public static void main(String[] args) {
        arrayList();
        stacks();
        queue();
        priorityQueue();
    }


    static void arrayList(){
        ArrayList<String> array = new ArrayList<>();
        ArrayListDS arrayListDS = new ArrayListDS(array);
        arrayListDS.addElements(new String[]{"Hello", "World", "Java"});
        arrayListDS.removeElement("World");
        arrayListDS.emptyArray();
        System.out.println(arrayListDS.isEmpty());
    }

    static void stacks(){
        String[] array = new String[]{"Hello", "World", "Java"};
        Stacks stacks = new Stacks(array);
        System.out.println(stacks.addElements());
        System.out.println(stacks.searchElementIndex("World"));
        System.out.println(stacks.popElement());
    }

    static void queue(){
        String[] array = new String[]{"Hello", "World", "Java"};
        QueueDS queueDS = new QueueDS(array);
        System.out.println(queueDS.addElements());
        System.out.println(queueDS.frontElement());
        System.out.println(queueDS.removeElement());
        System.out.println(queueDS.isEmpty());
    }

    static void priorityQueue(){
        int[] array = new int[]{1, 2, 3, 4, 5};
        PriorityQueueDS priorityQueueDS = new PriorityQueueDS(array);
        System.out.println(priorityQueueDS.insert());
        System.out.println(priorityQueueDS.getHighestPriority());
        System.out.println(priorityQueueDS.removeHighestPriority());
    }

}
