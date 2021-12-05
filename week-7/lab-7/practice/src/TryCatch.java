import java.util.*;

public class TryCatch {
    public static void main(String args[]) {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer");
        try {
            // System.out.println("Before taking integer input");
            x = sc.nextInt();
            System.out.println("Integer entered = " + x);
        } catch (Exception e) {
            x = 0;
            System.out.println("Please enter an integer only.");
        }
    }
}