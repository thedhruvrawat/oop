import java.io.*;
import java.util.*;

class Parent {
    int a;
    int b;

    Parent() {
        a = 5;
        b = 10;
    }

    Parent(int a, int b) {
        this.a = a;
        this.b = b;
        /* implement the parameterized constructor to set the value of a and b. */
    }
}

class Child extends Parent {
    int b;

    Child() {
        this.b = 3;
        /*
         * implement the parameterless constructor to set the value of b in the child
         * class object as 3;
         */
    }

    Child(int a, int b) {
        super(a, b * 2);
        this.a = a;
        this.b = b;

        /*
         * implement the parameterized constructor for this class using the values a and
         * b. The parent class object should have two times the value of b compared to
         * the child class. Do not add any new instance variables!
         */
    }

    void print() {
        System.out.println(a);
        System.out.println(super.b);
        System.out.println(b);
        /*
         * implement the print method to print the value of a in the child class, b in
         * the parent class and b in the child class. Print these three values on three
         * separate lines.
         */
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        Child c1 = new Child();
        c1.print();
        Child c2 = new Child(x, y);
        c2.print();
        /*
         * Complete the class definition given above and use appropriate methods in this
         * main function to get the desired answer
         */
    }
}