import java.util.*;

public class CloneLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        LinkedList<String> clone = new LinkedList<String>();
        clone.addAll(list);
        System.out.println("Original list: " + list);
        System.out.println("Clone list: " + clone);
    }
}