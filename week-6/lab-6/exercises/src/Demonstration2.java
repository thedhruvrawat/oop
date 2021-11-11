//Importing all utility classes
import java.util.*;

// Main class
public class Demonstration2 {
    // Main driver method
    public static void main(String args[]) {
        // Creating an object of ArrayList class
        ArrayList<String> arr = new ArrayList<>();
        arr.add("STR1");
        arr.add("STR2");
        arr.add("STR3");
        arr.add(1, "STR1");

        // 2a correct following line of code
        // arr.set("STR5", 2);
        arr.set(2, "STR5");

        // 2b remove the second element from arr, by adding a line.
        arr.remove(1);

        // 2c Try to write one line code code for printing ArrayList elements.
        System.out.println(arr);
        
        // 2d Removing only the first instance of "STR1"
        arr.remove("STR1");

        // 2e print all ArrayList elements by advanced for loop
        for(String s:arr) {
            System.out.println(s);
        }

        // 2f traverse arr using Iterator
        Iterator<String> itr = arr.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // 2g check whether ArrayList is empty or not
        if(arr.isEmpty()) {
            System.out.println("ArrayList is empty");
        } else {
            System.out.println("ArrayList is not empty");
        }

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        // 2h add all the elements of al2 to arr
        arr.addAll(al2);

        // 2i finally sort the ArrayList arr
        Collections.sort(arr);
    }
}