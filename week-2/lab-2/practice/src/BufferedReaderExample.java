import java.io.*; // java.io package is imported for using BufferedReaderclass

class BufferedReaderExample {
    public static void main(String args[]) throws IOException {
        
        /* instantiate InputStreamReader class and pass System.in to its constructor */
        InputStreamReader isr = new InputStreamReader(System.in);
        
        /* instantiate BufferedReader class and pass the reference variable isr which is id of type
        InputStreamReader created in the previous line to the constructor of BufferedReader */
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("Enter Your First Name: ");
        
        /* call readLine method on br reference variable which is of type BufferedReader */
        String name = br.readLine();
        System.out.println("Yourname is: " + name);
    } 
}
