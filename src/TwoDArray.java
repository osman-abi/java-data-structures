class TwoDArray{

    public static void main(String[] args) {
        char[][] arr1 = new char[][] {
            new char[]{'0', '-', '-'},
            new char[]{'-', '0', '-'},
            new char[]{'-', '-', '0'}
        };

        char[][] arr2 = new char[][] {
                new char[]{'-', '0', '-'},
                new char[]{'-', '0', '-'},
                new char[]{'-', '0', '-'}
        };

        char[][] arr3 = new char[][] {
                new char[]{'0', '-', '-'},
                new char[]{'-', '0', '-'},
                new char[]{'0', '-', '-'}
        };

        char[][] arr4 = new char[][] {
                new char[]{'-', '-', '0'},
                new char[]{'-', '0', '-'},
                new char[]{'0', '-', '-'}
        };

        isTwoDArraySame(arr1);
        isTwoDArraySame(arr2);
        isTwoDArraySame(arr3);
        isTwoDArraySame(arr4);

    }

    static boolean isAllSame(char[] array){
        char first = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] != first || array[i] != '0'){
                return false;
            }
        }
        return true;
    }

    static boolean isDiagonalSame(char[][] arr){
        char[] diagonal = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            diagonal[i] = arr[i][i];
        }
        return isAllSame(diagonal);
    }

    static boolean isAntiDiagonalSame(char[][] arr){
        char[] antiDiagonal = new char[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            antiDiagonal[i] = arr[i][arr.length - i - 1];
        }
        return isAllSame(antiDiagonal);
    }

    static boolean isRowSame(char[][] arr){
        for (char[] row : arr) {
            if(isAllSame(row)){
                return true;
            }
        }
        return false;
    }

    static boolean isColumnSame(char[][] arr){
        for (int i = 0; i < arr.length; i++) {
            char[] column = new char[arr.length];
            for (int j = 0; j < arr.length; j++) {
                column[j] = arr[j][i];
            }
            if(isAllSame(column)){
                return true;
            }
        }
        return false;
    }

    public static void printArray(char[][] arr) {
        for (char[] row : arr) {
            for (char num : row) {
                System.out.print(num + " ");  // Print each element with a space
            }
            System.out.println(); // Newline after each row
        }
    }

    static void isTwoDArraySame(char[][] arr){
        if (isDiagonalSame(arr)) {
            System.out.println("Combination is same in Diagonal: ");
            printArray(arr);

        }else if(isAntiDiagonalSame(arr)){
            System.out.println("Combination is same in Anti Diagonal: ");
            printArray(arr);
        }else if(isRowSame(arr)){
            System.out.println("Combination is same in Row: ");
            printArray(arr);
        }else if(isColumnSame(arr)){
            System.out.println("Combination is same in Column: ");
            printArray(arr);
        }else{
            System.out.println("GAME OVER");
        }
    }

}