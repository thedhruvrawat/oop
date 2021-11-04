class MyStatic {
    int a; // initialized to 0 for every object
    static int b; // initialized to 0 only once when class loads
    // Constructor to increment b

    MyStatic() {
        b++;
    }

    public void showData() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
    
    // public static void increment() { 
    //     a++; 
    // }
}

class StaticDemo {
    public static void main(String args[]) {
        MyStatic s1 = new MyStatic();
        s1.showData();
        MyStatic s2 = new MyStatic();
        s2.showData();
        MyStatic.b++; 
        s1.showData(); 
        s2.showData();
    }
}
