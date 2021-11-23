// @FunctionalInterface
interface myInterface1 {
    void meth1();
} 

class A implements myInterface1{

    public void meth1(){
        System.out.println("this is method 1");
    }

    public void greet(){
        System.out.println("Hello");
    }

    // @Override
    public void greet(String name){
        System.out.println("Hello "+name);
    }
}

public class AnnotationInJava {
    public static void main(String[] args) {
        
        A obj = new A();
        obj.greet("Atul");

        obj.meth1();

    }
}