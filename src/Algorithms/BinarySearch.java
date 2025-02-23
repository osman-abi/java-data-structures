package Algorithms;
import java.util.Arrays;

public class BinarySearch {

    int[] array;

    public BinarySearch(int[] array) {
        Arrays.sort(array);
        this.array = array;
    }

    String searchData(int data) {
        int lowLevel = 0;
        int highLevel = array.length - 1;
        int midLevel;
        while (lowLevel <= highLevel) {
            midLevel = (lowLevel + highLevel) / 2;
            if (array[midLevel] == data) {
                return "Data found at index: " + midLevel;
            } else if (array[midLevel] < data) {
                lowLevel = midLevel + 1;
            } else {
                highLevel = midLevel - 1;
            }
        }
            return "Data not found";

    }

}
