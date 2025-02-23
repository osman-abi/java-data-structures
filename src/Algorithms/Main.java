package Algorithms;

public class Main {
    public static void main(String[] args) {
        linearSearch();
        binarySearch(115);
        binarySearch(200);
    }

    static void linearSearch(){
        LinearSearch linearArray = new LinearSearch(new int[]{1, 2, 3, 4, 5});
        System.out.println(linearArray.searchData(3));
    }

    static void binarySearch(int data){
        int[] array = new int[200];
        for (int i = 0; i < 200; i++) {
            array[i] = i;
        }

        BinarySearch binaryArray = new BinarySearch(array);
        System.out.println(binaryArray.searchData(data));
    }

}
