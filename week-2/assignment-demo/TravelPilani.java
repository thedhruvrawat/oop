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
        int dp = Integer.parseInt(br.readLine());
        int jp = Integer.parseInt(br.readLine());
        String city = br.readLine();
        if (city.equals("Delhi")) {
            System.out.println(dp);
        } else {
            System.out.println(jp);
        }
    }
}