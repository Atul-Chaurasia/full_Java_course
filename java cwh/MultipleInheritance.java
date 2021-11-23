interface Camera{

    void clickPhoto();
    void recordVideo();

    // default void recordVideoIn4k(){
    //     System.out.println("Video Recording in 4K");
    // }
}
interface Internft{

    String[] numberOfNetwork();
    void noOfDeviceConnect(int n);
}
class CellularPhone{

    void calling(long number){
        System.out.println("Calling to : "+number);
    }
}
class SmartPhone extends CellularPhone implements Camera, Internet{

    public void clickPhoto(){
        System.out.println("Taking Snap...");
    }
    
    public void recordVideo(){
        System.out.println("Recording video...");
    }
    
    public String[] numberOfNetwork(){
        System.out.println("No. of Networks...");
        String[] networkList = {"Atul123", "Jay321", "12345"};
        return networkList; 
    }
    
    public void noOfDeviceConnect(int n){
        System.out.println("Connected Device : "+n);
    }
}
public class MultipleInheritance{
    public static void main(String[] args) {
        
        SmartPhone s1 = new SmartPhone();
        s1.clickPhoto();
        s1.recordVideo();
        
        String[] ar = s1.numberOfNetwork();
        for(String item : ar){
            System.out.println(item);
        }

        s1.noOfDeviceConnect(2);
    }
}