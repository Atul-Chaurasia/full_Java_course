interface A{

    void meth1();        
}

interface B extends A{    // <-- inheritance in interface

    void meth2();
}

class C implements B{

    public void meth1(){
        System.out.println("Method 1");
    }

    public void meth2(){
        System.out.println("Method 2");
    }
    
}

public class InheritanceInInterface{
    public static void main(String[] args) {
        
        C obj = new C();
        obj.meth1();
        obj.meth2();
    }
}