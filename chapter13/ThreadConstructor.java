class MyThreadCons extends Thread{
    
    MyThreadCons(String name){
        super(name);
    }
    public void run(){
        while(true){

            System.out.println("Hello "+this.getName());
        }
    }
}
public class ThreadConstructor {
    public static void main(String[] args) {
        
        MyThreadCons t1 = new MyThreadCons("Atul");
        MyThreadCons t2 = new MyThreadCons("Atul1");
        MyThreadCons t3 = new MyThreadCons("Atul2");
        MyThreadCons t4 = new MyThreadCons("Atul3 High priority");

        t4.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        
    }
}