import java.util.Scanner;

class ScannerExample {
    public static void main(String args[]) {
        
        int num1;
        double double1;
        String numStr1, numStr2;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        num1 = in.nextInt(); 
        System.out.println("You entered: " + num1);
       
        System.out.println("Enter a double: ");
        double1 = in.nextDouble();
        System.out.println("You entered: " + double1);
        
        System.out.println("Enter your first name ");
        numStr1 = in.next();        
        System.out.println("Your name is " + numStr1);

        System.out.println("Enter your surname");
        numStr2 = in.next();
        System.out.println("Your surname is " + numStr2);

        in.close();
    }
}
