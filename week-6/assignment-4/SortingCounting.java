import java.util.*;

public class SortingCounting {

    public static void main(String[] args) {
        TreeMap<String, Integer> mp = new TreeMap<String, Integer>();
        // use appropriate constructor to initialise

        Scanner s = new Scanner(System.in);
        List<String> sg = new ArrayList<String>();
        int num = s.nextInt();
        for (int i = 0; i < num; i++)
            sg.add(s.next());
        Set<String> hash = new HashSet<String>(sg);
        List<String> list = new ArrayList<String>(hash);
        for (int i = 0; i < list.size(); i++)
            mp.put(list.get(i), Collections.frequency(sg, list.get(i)));
        Map<String, Integer> reverse = mp.descendingMap();
        for (Map.Entry<String, Integer> e : reverse.entrySet())
            System.out.println(e.getKey() + ":" + e.getValue());
    }

}