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
        long n = Long.parseLong(br.readLine());
        System.out.println(n * (n + 1) / 2);
        br.close();
    }
}