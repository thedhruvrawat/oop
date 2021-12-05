import java.io.*;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileReader("input2.txt")); //line1
        Scanner sc1 = null;
        PrintWriter pw = new PrintWriter(new FileWriter("output2.txt"));
        String newLine = null;
        String s = "";
        while (sc.hasNextLine()) {
            newLine = sc.nextLine();
            sc1 = new Scanner(newLine); //line2
            sc1.useDelimiter("/"); //line3
            s += "Name:" + sc1.next() + "\n";
            s += "Year: " + sc1.nextInt() + "\n";
            s += "Age:" + sc1.nextInt() + "\n";
            sc1.close();
            pw.write(s);
            pw.flush(); //line4
            s = ""; //line5
        }
        sc.close();
        pw.close();
    }
}