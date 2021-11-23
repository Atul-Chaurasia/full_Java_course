/* We can create the reference of interface but can't create object */

interface Camera{

    void takeSnap();
}
interface Wifi{

    void nameOfWifi(String name);
}

class CellPhone implements Camera, Wifi {

    void calling(long number){
        System.out.println("Calling to : "+number);
    }

    public void takeSnap(){
        System.out.println("Taking Snap...");
    }

    public void nameOfWifi(String name){
        System.out.println("Name of Wifi : "+name);
    }
}

public class PolymorUsingInterface{

    public static void main(String[] args) {
        
        // CellPhone c1 = new CellPhone();
        // c1.calling(87655776);
        // c1.takeSnap();
        // c1.nameOfWifi("Galaxy S21");

        Wifi w1 = new CellPhone();

        // w1.takeSnap();   -->  not allowed to use the methods of CellPhone
        w1.nameOfWifi("Nokia 6200");   //-->  only use wifi method

        // Camera cam = new Camera();//  Camera is abstract; cannot be instantiated

    }
}