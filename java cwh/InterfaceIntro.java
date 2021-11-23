interface Car{
    void accelerate();
    void noOfGear(int n);
}

interface Bike extends Car{
    final int noOfTyres = 2;
    void engineInCc(int x);
        
}

class BodyOfVehicles implements Bike{

    int tyres;

    public void accelerate(){
        System.out.println("Car is accelerated");
    }
    public void noOfGear(int n){
        System.out.println("No. of Gears: "+n);
    }

    public void engineInCc(int x){
        if(x<=100){
            System.out.println("Splender");
        }
        else if(x>100 && x<350){
            System.out.println("Pulser or Apache");
        }
        else if(x>=350 && x<=500){
            System.out.println("Bullet");
        }
        else{
            System.out.println("You have a Super Bike...");
        }
    }    
}
class InterfaceIntro{
    public static void main(String[] args) {
        
        BodyOfVehicles alto = new BodyOfVehicles();
        // alto.tyres = 4;
        // System.out.println("Tyres: "+alto.tyres);

        // alto.accelerate();
        // alto.noOfGear(5);

        BodyOfVehicles passion = new BodyOfVehicles();
        // passion.tyres=3;  --> no change occur because typres are final.
        System.out.println(passion.noOfTyres);
        passion.noOfGear(5);
        passion.engineInCc(350);
    }
}