import java.io.PrintWriter;
import java.io.FileWriter;

class Student {
    String name;
    int year, age;

    Student(String name, int year, int age) {
        this.name = name;
        this.year = year;
        this.age = age;
    }
}

public class PrintWriterExample {
    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter(System.out); //line1
        pw.write("Hey JavaBeans!\n");
        pw.flush();
        Student s1 = new Student("Teja",2020,22);
        pw.close();
        PrintWriter pw1 = null;
        pw1 = new PrintWriter(new FileWriter("output1.txt",true)); //line2
        pw1.write("BITS Pilani Students info \n");
        pw1.flush();
        //check the file contents
        Student s2 = new Student("Harshith",2020,22);
        pw1.write(s1.name+","+s1.year+","+s1.age+"\n"); //line3
        pw1.write(s2.name+","+s2.year+","+s2.age); //line4
        //pw1.print(s1); //line5
        pw1.flush();
        pw1.close();
    }
}
