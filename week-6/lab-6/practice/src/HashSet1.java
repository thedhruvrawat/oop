import java.util.HashSet;

class Student{
    int id;
    String name;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void printDetails() {
        System.out.println(id + "," + name);
    }
}

public class HashSet1{
    public static void main(String[] args) {
        // Part1
        HashSet<Integer> hs1 = new HashSet<Integer>();
        System.out.println("Integer values: ");
        hs1.add(23);
        hs1.add(32);
        hs1.add(45);
        hs1.add(67);
        hs1.add(32);
        // Output1
        for(Integer i : hs1) {
            System.out.println(i);
        }
        // Part2
        HashSet<Student> hs2 = new HashSet<Student>(3); // line1
        // ----check size---- using size method
        hs2.add(new Student("Amit", 1)); // line2
        Student s = new Student("Geetika", 2);
        hs2.add(s);
        s = new Student("Teja", 3); // line3
        hs2.add(s);// line4
        // ---check size---
        hs2.add(new Student("Amit", 1)); // line5
        hs2.add(new Student("Harshith", 4));
        // Output2
        System.out.println("Student Details: ");
        for(Student t : hs2) {
            t.printDetails();
        }
    }
}