// Importing all utility classes
import java.util.*;
// Main class
public class Demonstration {
// Main driver method
    public static void main(String args[]) {
        // Creating an Array of string type
        ArrayList <String> arr = new ArrayList<>();
        // Adding elements to ArrayList
        // 1a Write the 2 lines to sequentially add "Learning", "Knowledge" string to the ArrayList.
        arr.add("Learning");
        arr.add("Knowledge");
        // 1b. Write the line to add "Tricky" string , such that it is at the second last position from left after insertion.
        int index = arr.size() - 2;
        arr.add(index, "Tricky");
        // 1c. Print all the elements of the array and verify your example.
        for(String s : arr) {
            System.out.println(s);
        }
    }
}