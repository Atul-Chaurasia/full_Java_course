class MyThread implements Runnable
{
    public void run(){
        System.out.println("This is thread 1");
    }
}
class MyThread1 implements Runnable{
    public void run(){
        System.out.println("Hello");
    }
}
public class RunnableThread{
    public static void main(String[] args) {
        
        MyThread bullet1 = new MyThread();
        Thread gun1 = new Thread(bullet1);
        
        MyThread1 bullet2 = new MyThread1();
        Thread gun2 = new Thread(bullet2);

        gun1.start(); 
        gun2.start(); 
    }
}