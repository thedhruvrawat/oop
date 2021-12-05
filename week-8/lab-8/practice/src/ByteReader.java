import java.io.*;

public class ByteReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File("input.txt"));// enter appropriate file location
        BufferedInputStream input = new BufferedInputStream(fileInputStream);
        try {
            char c = (char) input.read();
            System.out.println("Read:' " + c + " 'from the file");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            input.close();
        }
    }
}