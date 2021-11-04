class A {
    public void speak() {
        System.out.println("This is class A");
    }
}

class B extends A {
    public void speak() {
        System.out.println("This is class B");
    }
}

class C extends A {
    public void speak() {
        System.out.println("This is class C");
    }
}

class D extends B {
    public void speak() {
        System.out.println("This is class D");
    }
}

class E extends C{
    public void speak() {
        System.out.println("This is class E");
    }
}

public class Speak {
    public static void main(String[] args) {
        A a1 = new D();
        // D d1 = new A();
        A a2 = new C();
        // E e1 = new C();
        a1.speak();
        // d1.speak();
        a2.speak();
        // e1.speak();
    }
}
