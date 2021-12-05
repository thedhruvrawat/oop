import java.util.*;

class MissPositive {
    private HashSet<Integer> set = new HashSet<Integer>();

    public MissPositive(List<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            if (!set.contains(list.get(i)))
                set.add(list.get(i));
    }

    public int firstMiss() {
        for (int i = 1; i <= Collections.max(set); i++)
            if (!set.contains(i))
                return i;
        return Collections.max(set) + 1;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        int n = scan.nextInt();

        for (int i = 0; i < n; i++)
            list.add(scan.nextInt());

        MissPositive obj = new MissPositive(list);

        System.out.println(obj.firstMiss());
    }

}