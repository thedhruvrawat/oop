import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class RPN {
    private List<String> myList = new ArrayList<String>();
    int value;

    public RPN(List<String> list) {
        this.myList = list;

    }

    public String operate(String n1, String n2, String op) {
        int N1 = Integer.parseInt(n1);
        int N2 = Integer.parseInt(n2);
        int value = 0;
        switch (op) {
            case "*":
                value += N1 * N2;
                break;
            case "+":
                value += N1 + N2;
                break;
            case "-":
                value += N1 - N2;
                break;
            case "/":
                value += N1 / N2;
                break;
        }
        return String.valueOf(value);
    }

    public int evaluate() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < myList.size(); i++) {
            if ("+-/*".contains(myList.get(i))) {
                String s1 = stack.pop().toString();
                String s2 = stack.pop().toString();
                stack.push(Integer.parseInt(operate(s2, s1, myList.get(i))));
            } else {
                stack.push(Integer.parseInt(myList.get(i)));
            }
        }
        return stack.pop();
    }
}

class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<String>();
        int length = Integer.parseInt(inp.readLine());
        for (int i = 0; i < length; i++) {
            String a = inp.readLine();
            arr.add(a);
        }
        RPN obj = new RPN(arr);
        System.out.println(obj.evaluate());

    }

}
