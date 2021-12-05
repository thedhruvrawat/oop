import java.io.*;

public class ByteWriter {
    public static void main(String[] args) throws IOException {
        String data = "We are learning to use byte streams.";
        BufferedOutputStream out = null;
        try {
            FileOutputStream fileOutputStream = new
            FileOutputStream(new File("output.txt"));
            out = new BufferedOutputStream(fileOutputStream);
            out.write(data.getBytes());
        }
        catch(Exception e) {
            System.out.println(e);
        }
        finally {
            out.close();
        }
    }
}