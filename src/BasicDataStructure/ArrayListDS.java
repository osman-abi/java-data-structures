package BasicDataStructure;
import java.util.ArrayList;
import java.util.Collections;

/**
 * ArrayList is a resizable array implementation of the List interface and the one of the basic data structure in Java.
 * It is a part of Java Collection Framework. Java collections framework is used for storing and manipulating
 * a group of objects.:
 * #1 Iterable -> #2 Collection -> #3 List -> #4 ArrayList
 */

public class ArrayListDS {

    ArrayList<String> array;

    public ArrayListDS(ArrayList<String> array){
        this.array = array;
    }

    public void addElements(String[] elements){
        Collections.addAll(array, elements);
    }

    public void removeElement(String element){
        array.remove(element);
    }

    public void emptyArray(){
        array.clear();
    }

    public boolean isEmpty(){
        return array.isEmpty();
    }

}
