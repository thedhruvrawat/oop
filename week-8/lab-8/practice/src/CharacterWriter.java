import java.io.*;

public class CharacterWriter {
    public static void main(String[] args) throws IOException {
        Writer out = null;
        String data = "We are learning to use character streams.";
        try {
            out = new FileWriter("output.txt");
            out.write(data);
        }
        catch(Exception e) {
            System.out.println(e);
        } finally {
            out.close();
        }
    }
}
