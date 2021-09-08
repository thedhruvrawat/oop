import java.util.Scanner;

class Exercise2 {
    public static void main(String args[]) {
        char c;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        c = in.next().charAt(0);
        System.out.println("The ASCII value of " + c + " is " + (int) c);
        in.close();
    }
    
}
