import java.io.*;
import java.util.*;

class CustomReturn {
    private boolean found;
    private int[] indexes;

    public CustomReturn() {
        found = false;
    }

    public CustomReturn(int a, int b, int c) {
        found = true;
        indexes[0] = a;
        indexes[1] = b;
        indexes[2] = c;
        Arrays.sort(indexes);
    }

    @Override
    public String toString() {
        if (found) {
            String s = indexes[0] + " " + indexes[1] + " " + indexes[2];
            return s;
        } else {
            String s = "No Valid Indexes exist!";
            return s;
        }
    }
}

class ThreeSum {

    private int[] arr;

    private boolean isSorted;

    public ThreeSum(int[] array) {
        arr = array;
    }

    public void replace(int first, int second) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) {
                arr[i] = second;
                Arrays.sort(arr);
                break;
            }
        }
    }

    public String printArr() {
        Arrays.sort(arr);
        return Arrays.toString(arr);

    }

    public String sumExists(int target) {
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if ((arr[i] + arr[j] + arr[k]) == target) {
                        System.out.println(i + " " + j + " " + k);
                        a = true;
                        break;
                    }
                }
            }
        }
        if (!a) {
            System.out.println("No Valid Indexes exist!");
        }
        return (new CustomReturn()).toString();
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        ThreeSum myObj = new ThreeSum(array);

        int q = scan.nextInt();

        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            if (a == 0) {
                System.out.println(myObj.printArr());
            } else if (a == 1) {
                int x, y;
                x = scan.nextInt();
                y = scan.nextInt();

                myObj.replace(x, y);
            } else {
                int x = scan.nextInt();
                myObj.sumExists(x);
            }
        }
    }
}