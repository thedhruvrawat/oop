public class Array2D {
    public static void main(String[] args) {
        int[][] intArray = new int[2][3];
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };
        intArray[0] = a;
        intArray[1] = b;
        for (int i = 0; i < intArray[0].length; i++) {
            System.out.print(intArray[0][i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < intArray[1].length; i++) {
            System.out.print(intArray[1][i] + " ");
        }
    }
}
