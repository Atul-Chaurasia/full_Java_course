class Th1 extends Thread{

    Th1(String name){
        super(name);    
    }
    public void run(){
        int i=1;
        while(i<=15){
            System.out.println("Hello "+this.getName());
            
            try {
                Thread.sleep(500);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }
    }
}
                
class Th2 extends Thread{
    public void run(){
        int i=1;
        while(i<=15){
            System.out.println("Hey Guys");
            i++;
        }
    }
}
public class ThreadMethod{
    public static void main(String[] args) {
        Th1 ob = new Th1("Atul");
        Th2 ob1 = new Th2();
        ob.start();
        
        try {
            ob.join();
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        ob1.start();
            
    }
}

