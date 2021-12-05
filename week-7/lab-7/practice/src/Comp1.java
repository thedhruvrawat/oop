// Java program to demonstrate working of Comparator
// interface
import java.io.*;
import java.lang.*;
import java.util.*;

// A class to represent a student.
class Student {
    int rollno;
    String name, address;
    int age;

    // Constructor
    public Student(int rollno, String name, String address, int age) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Used to print student details in main()
    public String toString() {
        return this.rollno + " " + this.name + " "
                + this.address + " " + this.age;
    }
}

class Sortbyroll implements Comparator<Student> {
// Used for sorting in ascending order of
// roll number
public int compare(Student a, Student b)
{
return a.rollno - b.rollno;
}
}

class Sortbyname implements Comparator<Student> {
// Used for sorting in ascending order of
// name
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

// Driver class
class Comp1 {
    public static void main(String[] args) {
        ArrayList<Student> ar = new ArrayList<Student>();
        ar.add(new Student(111, "bbbb", "london", 18));
        ar.add(new Student(131, "aaaa", "nyc", 18));
        ar.add(new Student(121, "cccc", "jaipur", 19));
        System.out.println("Unsorted");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Sortbyroll());
        System.out.println("\nSorted by rollno");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}