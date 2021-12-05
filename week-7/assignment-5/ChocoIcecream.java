import java.util.*;

class FindChoc {
    private String allFlav;
    private String chocFlav;

    private HashSet<Character> set = new HashSet<Character>();

    public FindChoc(String allFlav, String chocFlav) {
        this.allFlav = allFlav;
        this.chocFlav = chocFlav;
        this.populateSet();
    }

    private void populateSet() {
        for (int i = 0; i < chocFlav.length(); i++) {
            if (!set.contains(chocFlav.charAt(i))) {
                set.add(chocFlav.charAt(i));
            }
        }
    }

    public int countChoc() {
        int count = 0;
        for (int i = 0; i < allFlav.length(); i++) {
            if (set.contains(allFlav.charAt(i))) {
                count += 1;
            }
        }
        return count;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        FindChoc obj = new FindChoc(s1, s2);
        System.out.println(obj.countChoc());
    }
}