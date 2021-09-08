import java.io.*;

class Exercise1 {
    public static void main(String args[]) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int sum = 0;
        System.out.println("Enter the 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            String num = br.readLine();
            sum += Integer.parseInt(num);
        }
        System.out.println("The sum of 10 numbers is "+sum);
    }
}