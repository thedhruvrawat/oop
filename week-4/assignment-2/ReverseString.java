import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        s1 = s1.trim();
        String[] s2 = s1.split("\\s");
        for (int i = s2.length - 1; i >= 0; i--) {
            if (i != 0)
                System.out.print(s2[i] + " ");
            else
                System.out.print(s2[i]);
        }
        s.close();
    }
}