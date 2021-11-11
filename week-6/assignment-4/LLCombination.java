import java.io.*;
import java.util.*;
/* import other necessary libraries if required */

/* 	NOTES: 
	
    You are not allowed to do the following:
		- Declare additional instance variables
        - Declare any global variables (global to the entire program)
        - Change the class definition and method signature already given
        - Add additional methods
    
    You are free to do the following:
    	- Declare local variables
*/

class LinkedListHandler {
    private LinkedList<Integer> ll = new LinkedList<Integer>();

    LinkedListHandler(LinkedList<Integer> r, LinkedList<Integer> s) {
        /* implement the constructor to initialize the linked list */
        for (int i = 0; i < r.size(); i++)
            ll.add(r.get(i));
        for (int i = s.size() - 1; i >= 0; i--)
            ll.add(s.get(i));
    }

    public void populate(int element) {
        /*
         * implement the overloaded method to add an element to the linked list taken
         * from standard input
         */
    }

    public void populate(LinkedList<Integer> r, LinkedList<Integer> s) {
        /*
         * implement the overloaded method to populate elements from two linked lists r
         * and s
         */
    }

    public void queryResponse(int pos) {
        /*
         * implement this method to return the element of the linked list at position
         * "pos" or indicate an invalid query
         */
        if (pos > 0 && pos <= ll.size())
            System.out.println(ll.get(pos - 1));
        else
            System.out.println("Invalid query");
    }
}

class LLCombination {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rLength = scan.nextInt();
        LinkedList<Integer> r = new LinkedList<Integer>();
        LinkedList<Integer> s = new LinkedList<Integer>();

        for (int i = 0; i < rLength; i++) {
            int a = scan.nextInt();
            r.add(a);
        }
        int sLength = scan.nextInt();
        for (int i = 0; i < sLength; i++) {
            int b = scan.nextInt();
            s.add(b);
        }
        LinkedListHandler obj = new LinkedListHandler(r, s);
        int query = scan.nextInt();

        for (int i = 0; i < query; i++) {
            int p, q;
            p = scan.nextInt();
            q = scan.nextInt();
            if (p == 0) {
                if (q > 0 && q <= r.size())
                    System.out.println(r.get(q - 1));
                else
                    System.out.println("Invalid query");
            } else if (p == 1) {
                if (q > 0 && q <= s.size())
                    System.out.println(s.get(q - 1));
                else
                    System.out.println("Invalid query");
            } else if (p == 2)
                obj.queryResponse(q);
            else
                System.out.println("Invalid query");
        }

    }
}