class MyThread1 extends Thread{
   
    public void run(){
        int i = 0;
        while(i<200){
            System.out.println("This is thread 1...");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<200){
            System.out.println("This is thread 2****");
            i++;
        }
    }
}
public class ThreadInJava{
    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}