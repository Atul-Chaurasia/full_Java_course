class MyThread1 extends Thread{

    public void run() {       // override run method
        int i = 0;
        while(i<=10){
            System.out.println("Welcome");
            i++;
        }
        System.out.println("");
    }
}
class MyThread2 extends Thread{

    public void run() {
        int i = 0;
        while(i<=10){
            try {
                Thread.sleep(150);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("HAPPY DIWALI");
            i++;
        }
    }
}
                
public class PracticeSet13{
    public static void main(String[] args) {
        
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        System.out.println(t2.getState());

        t1.start();
        t2.start();

        System.out.println(t2.getState());

        t1.setPriority(6);
        t2.setPriority(8);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        
        System.out.println(t2.getState());
    }
}            
