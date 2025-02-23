package Algorithms;

public class LinearSearch {
    /**
     * Linear search is a simple search algorithm that searches for a target value within an array.
     * It sequentially checks each element of the array for the target value until a match is found or until all the elements have been searched.
     * #1 searchData: O(n)
     */

    int[] array;

    public LinearSearch(int[] array) {
        this.array = array;
    }

    public int searchData(int data) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }
}
