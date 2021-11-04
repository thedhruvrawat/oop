public class ArrayInit {
    public static void main(String[] args) {
        int[] a1 = new int[] { 1, 2, 3, 4, 5 };
        byte[] a2 = { 5, 2, 4 };
        System.out.println("Int Array1");
        for (int i = 0; i < 5; i++) {
            System.out.println(a1[i]);
        }
        System.out.println("Byte Array2");
        for (int j = 0; j < a2.length; j++) {
            System.out.println(a2[j]);
        }
        int n = 4; // line1
        float[] a3 = new float[n];
        a3[1] = 2;
        a3[2] = 3;
        a3[3] = 4;
        // a3[4] = 5; //line2
        System.out.println("Float Array3");
        for (int k = 0; k < n; k++) {
            System.out.println(a3[k]);
        }
    }
}