import java.util.*;

public class IterateLinkedList {
    
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");
        list.add("Negan");
        list.add("Rick");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
