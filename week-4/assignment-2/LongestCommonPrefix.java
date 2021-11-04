import java.io.*;

class LongestCommonPrefix {
    int n;
    /* Declare an instance variable to store the list of strings */
    String[] listOfStrings = new String[n];

    LongestCommonPrefix(String[] listOfStrings) {
        this.listOfStrings = listOfStrings;
        this.n = listOfStrings.length;
    }

    public void augment(String[] listOfStrings) {
        /*
         * Implement the augment method to augment/modify a string in the list of
         * strings in order to act as a utility method to solve the given question
         */
        int min = listOfStrings[0].length();
        for (int i = 0; i < n; i++)
            if (listOfStrings[i].length() < min)
                min = listOfStrings[i].length();
        if (min == 0)
            for (int i = 0; i < n; i++)
                listOfStrings[i] = "";
        else if (min == 1)
            for (int i = 0; i < n; i++)
                listOfStrings[i] = Character.toString(listOfStrings[i].charAt(0));
        else
            for (int i = 0; i < n; i++)
                listOfStrings[i] = listOfStrings[i].substring(0, min);
    }

    public String longestPrefixString() {
        /*
         * Complete the method to find longest prefix in all strings of the list of
         * strings
         */
        String pre = "";
        char curr = listOfStrings[0].charAt(0);
        int min = listOfStrings[0].length();
        if (n == 0)
            pre = "-";
        else if (n == 1)
            pre = listOfStrings[0];
        else
            for (int chck = 1; chck < n; chck++)
                if (listOfStrings[chck].charAt(0) != curr)
                    pre = "-";
        for (int i = 0; i < min; i++) {
            curr = listOfStrings[0].charAt(i);
            for (int j = 1; j < n; j++)
                if (listOfStrings[j].charAt(i) != curr)
                    return pre;
            pre += (curr);
        }
        return pre;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] stringArray = new String[size];
        for (int i = 0; i < size; i++)
            stringArray[i] = br.readLine();
        LongestCommonPrefix lcp = new LongestCommonPrefix(stringArray);
        lcp.augment(lcp.listOfStrings);
        System.out.print(lcp.longestPrefixString());

    }
}