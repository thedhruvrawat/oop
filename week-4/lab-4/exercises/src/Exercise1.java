public class Exercise1 {
    /* Implement all the required functionalities here */
    /*
     * Prefer to have a method for printing array elements with name "printArray"
     */

    public static int[] cloneArray(int[] arr) {
        return arr;
    }

    public static int[] cloneArray(int[] arr, int len) {
        int subArr[] = new int[len];
        for (int i = 0; i < len; i++) {
            subArr[i] = arr[i];
        }
        return subArr;
    }

    public static int[] cloneArray(int[] arr, int start, int len) {
        int subArr2[] = new int[len];
        for (int i = 0; i < len; i++) {
            subArr2[i] = arr[start+i];
        }
        return subArr2;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        /*
         * declare and initialize an array 'arr' Try to clone 'arr' in the
         * above-mentioned ways by calling the above methods.
         */
        int arr[] = { 1, 2, 3, 4, 5 , 6 , 7 , 8 , 9 , 10};
        printArray(cloneArray(arr, 3, 5));
    }
}
/*
 * Example: arr is {1,2,3,4,5,6,7,8,9}, cloning a sub-array with length '4'
 * gives out a new array with elements {1,2,3,4}, if you print it. cloning a
 * sub-array with start index '3' and length '5' gives out {4,5,6,7,8} new
 * array.
 */