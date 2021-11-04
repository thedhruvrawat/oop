import java.io.*;

class TestStatic1 {
    static int a = 10;

    static void setA() {
        a = 6;
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        TestStatic1.setA();
        System.out.println(TestStatic1.a);
        TestStatic1.a = n;
        System.out.println(TestStatic1.a);
    }
}