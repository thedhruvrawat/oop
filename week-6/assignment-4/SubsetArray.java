import java.util.*;

class FindSub {
    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();

    public FindSub(List<Integer> bigList, List<Integer> smallList) {
        if (bigList.size() > smallList.size()) {
            list1 = bigList;
            list2 = smallList;
        } else {
            list2 = bigList;
            list1 = smallList;
        }
    }

    public String isSubset() {
        HashSet<Integer> myHash = new HashSet<Integer>();
        for (int i = 0; i < list1.size(); i++) {
            if (!myHash.contains(list1.get(i))) {
                myHash.add(list1.get(i));
            }
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!myHash.contains(list2.get(i))) {
                return list2.get(i).toString();
            }
        }
        return "Subset";
    }

}

public class SubsetArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1, str2;
        Integer n1;
        List<Integer> list1 = new ArrayList<Integer>();
        Integer n2;
        List<Integer> list2 = new ArrayList<Integer>();
        // read input
        n1 = scan.nextInt();
        for (int i = 0; i < n1; i++) {
            int x = scan.nextInt();
            list1.add(x);
        }
        n2 = scan.nextInt();
        for (int i = 0; i < n2; i++) {
            int y = scan.nextInt();
            list2.add(y);
        }
        FindSub obj = new FindSub(list1, list2); // instantiate the object properly
        System.out.println(obj.isSubset());
    }

}