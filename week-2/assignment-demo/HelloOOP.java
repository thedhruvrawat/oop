import java.io.*;
import java.util.*;

/*
    BITS ID: 2019B3A70537P
    NAME: DHRUV RAWAT
    LAB SECTION: P1
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BufferedWriter output = new BufferedWriter(new OutputStreamWriter(System.out));
        //Use this otherwise last test case won't work
        while (n-- > 0) {
            output.write("Hello OOP\n");
        }
        output.flush();
    }
}