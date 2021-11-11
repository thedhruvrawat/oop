import java.io.*;
import java.util.*;
/* import other libraries (if required) */

/* 	NOTES: 
	
    You are not allowed to do the following:
		- Declare additional instance variables
        - Declare any global variables (global to the entire program)
        - Change the class definition and method signature already given
        - Add additional methods
    
    You are free to do the following:
    	- Declare local variables
*/

class BalancedP {
    private Stack<Character> braces;
    Stack<Character> s = new Stack<Character>();

    BalancedP(Stack<Character> stk) {
        /* implement the constructor to initiate the stack of braces */
        braces = stk;
        for (int i = 0; i < braces.size(); i++) {
            if (braces.get(0) != '}') {
                if (braces.get(i) == '{') {
                    handleOpeningBrace();
                }
                if (braces.get(i) == '}' && s.size() != 0 && braces.get(i) != '{') {
                    handleClosingBrace();
                }
            } else {
                s.push('x');
            }

        }
        testForBalance();
    }

    public void handleOpeningBrace() {
        s.push('{');
    }

    public void handleClosingBrace() {
        s.pop();
    }

    public String testForBalance() {
        if (s.size() == 0)
            return "Balanced";
        else
            return "Not balanced";
    }
}

class BalancedParantheses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        Stack<Character> stk = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
            stk.add(str.charAt(i));
        BalancedP obj = new BalancedP(stk);
        System.out.println(obj.testForBalance());
    }
}