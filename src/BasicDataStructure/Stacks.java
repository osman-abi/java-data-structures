package BasicDataStructure;
import java.util.Stack;

public class Stacks {
    /**
     * Stack is a linear data structure which follows a particular order in which the operations are performed.
     * LIFO: Last In First Out (which means store objects like vertical tower)
     * #1 push: Add an item to the stack. If the stack is full, then it is said to be an Overflow condition.
     * #2 pop: Remove an item from the stack. The items are popped in the reversed order in which they are pushed.
     */
    String[] array;
    Stack<String> stack;

    public Stacks(String[] array) {
        this.array = array;
        this.stack = new Stack<>();
    }

    public Stack<String> addElements(){
        for (String element : array) {
            stack.push(element);
        }
        return stack;
    }

    public int searchElementIndex(String element){
        return stack.search(element);
    }

    public String popElement(){
        return stack.pop();
    }
}
