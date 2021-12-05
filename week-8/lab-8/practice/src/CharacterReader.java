import java.io.*;

public class CharacterReader {
    public static void main(String[] args) throws IOException {
        Reader input = null;
        try {
            input = new FileReader("input.txt");
            char c = (char) input.read();
            System.out.println("Read: '" + c + "' from the file");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            input.close();
        }
    }
}