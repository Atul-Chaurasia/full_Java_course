class Base1 {

    Base1() {
        System.out.println("Base class Constructor");
    }
    Base1(int a) {
        System.out.println("Overloaded base class constructor with value of a : "+a);
    }
}

class Derived extends Base1 {

    Derived() {
        // super(5);
        System.out.println("Derived class Constructor");
    }

    Derived(int a, int b) {
        super(a);
        System.out.println("Overloaded derived class constructor with value b : "+b);
    }
}

class DerivedChild extends Derived {

    DerivedChild() {
        System.out.println("Derived Child constructor");
    }

    DerivedChild(int a, int b, int c) {
        super(a,b);
        System.out.println("Overloaded derived child constructor with value c : "+c);
    }
}

public class ConstructorInheritance {

    public static void main(String[] args) {
        
        // Base1 b = new Base1();
        // Derived d = new Derived(2,4);
        DerivedChild dc = new DerivedChild(6,8,10);
    }
}