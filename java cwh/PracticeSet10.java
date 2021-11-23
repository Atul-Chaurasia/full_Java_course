// Q1...

// class Circle {

//     int radius;

//     Circle(){
//         System.out.println("first Constructor of circle");
//     }

//     Circle (int r){
//         // System.out.println("second Constructor of circle");
//         this.radius = r;
//     }

//     public double areaOfCircle(){
//         return Math.PI*this.radius*this.radius;
//     }
// }
// class Cylinder extends Circle{

//     int height;
    
//     Cylinder(int r, int h){
//         super(r);
//         this.height=h;
//     }

//     public double volumeOfCylinder(){
//         return Math.PI*this.radius*this.radius*this.height;
//     }
// }

//################################################################

// class Rectangle{
//     int length,width;
    
//     public Rectangle(int l, int w){
//         this.length=l;
//         this.width=w;
//     }

//     public double areaOfRec(){
//         return this.length*this.width;
//     }
// }

// class Cuboid extends Rectangle{
//     int height;

//     public Cuboid(int l, int w, int h){
//         super(l,w);
//         this.height=h;
//     }

//     public double areaOfCuboid(){
//         return this.length*this.width*this.height;
//     }
// }

// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@

class Rect {

    private int length;
    private int width;

    // Rect(int l, int w){
    //     this.length = l;
    //     this.width = w;
    // }
   
    public void setLength(int l){
        this.length = l;
    }
    public int getLength(){
        return length;
    }
    public void setWidth(int w){
        this.width = w;
    }
    public int getWidth(){
        return width;
    }
    

    public int areaOfRect(){
        return length*width;
    }
}
class Cuboid extends Rect{
    private int height;

    public void setHeight(int h){
        this.height=h;
    }
    public int getHeight(){
        return height;
    }
  
    public int volumeOfCuboid(){
        
        return length*width*height;
    }
}
public class PracticeSet10{
    public static void main(String[] args) {

        Rect r1 = new Rect();
        r1.setLength(2);
        r1.setWidth(4);
        System.out.println("length : "+r1.getLength());
        System.out.println("Width : "+r1.getWidth());
        System.out.println("Area of Rectangle : "+r1.areaOfRect());
        
        Cuboid c1 = new Cuboid();
        c1.setHeight(2);
        System.out.println("volume of cuboid : "+c1.volumeOfCuboid());
        
        // Q1..
        // Circle c1 = new Circle();
        // System.out.println(c1.areaOfCircle());

        // Cylinder cy1 = new Cylinder(2,2);
        // System.out.println(cy1.volumeOfCylinder());

        // Q2..
        // Rectangle r1 = new Rectangle(2,4);
        // System.out.println(r1.areaOfRec());

        // Cuboid cb1 = new Cuboid(2,3,2);
        // System.out.println(cb1.areaOfCuboid());

    }
}