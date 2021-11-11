import java.util.*;

public class IterateLinkedList2 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Steve");
        list.add("Carl");
        list.add("Raj");
        list.add("Negan");
        list.add("Rick");
        int pos = 2;
        ListIterator<String> iterator = list.listIterator(pos);
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
