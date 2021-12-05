import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NextGreater {
    private List<Integer> list;
    private Stack<Integer> st = new Stack<>();

    public NextGreater(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> findAnswers() {
        List<Integer> l1 = new ArrayList<Integer>();
        for (int k = list.size() - 1; k > -1; k--) {
            st.push(list.get(k));
        }
        while (!st.isEmpty()) {
            int max = st.peek();
            for (int k = st.size() - 1; k > -1; k--) {
                if (st.get(k) > max) {
                    max = st.get(k);
                    break;
                }
            }
            if (st.pop() < max)
                l1.add(max);
            else
                l1.add(-1);
        }
        return l1;
    }
}

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(inp.readLine());
        List<Integer> list = new ArrayList<Integer>();
        String space = inp.readLine();
        String[] arr = space.split(" ");
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        NextGreater obj = new NextGreater(list);
        System.out.println(obj.findAnswers().toString());

    }

}