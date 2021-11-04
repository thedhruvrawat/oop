public class Exercise2 {
    /*
     * Implement a method that takes 2D array 'arr' as input and outputs the'
     * newArray' 1D array.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] sumColumn(int[][] arr) {
        int[] sumArray = new int[arr[0].length];
        for(int i=0; i<arr.length; i++) 
            for(int j=0; j<arr[i].length; j++) 
                sumArray[j] += arr[i][j];
        return sumArray;
    }
    public static void main(String[] args) {
        //declare and initialize 2D array 'arr' here for simplicity purposes!
        //print the newArray contents here!
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        printArray(sumColumn(arr));
    }
}
/*
 * Example: Input array 'arr' contents :[ [1 2 3], [4 5 6], [7 8 9] ] 'newArray'
 * contents : [ 12 15 18 ] newArray[i] = sum of elements of column ‘i’ of ‘arr’
 * 2D array.
 */