class Cylinder {
   
        private int radius;
        private int height;

        public Cylinder(int radius, int height) {
            this.radius = radius;
            this.height = height;
        }

        public int getRadius(){
            return radius;
        }
        public void setRadius(int radius){
            this.radius = radius;
        }

        public int getHeight(){
            return height;
        }
        public void setHeight(int height){
            this.height = height;
        }

        public double surfaceAreaOfCylinder(){
            return 2*Math.PI*radius*height+2*Math.PI*radius*radius;
        }

        public double volumeOfCylinder(){
            return Math.PI*radius*radius*height;
        }
}

class Rectangle {

    private int length;
    private int breadth;

    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    Rectangle(){
        length = 4;
        breadth = 5;
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth =breadth;
    }

}

class Sphere {
   
    private int radius;
    // private int height;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }    

    public double areaOfSphere(){
        return 4*Math.PI*radius*radius;
    }
}

public class PracticeSet9 {
    public static void main(String[] args) {

        // Q1 ...
        Cylinder obj = new Cylinder(6, 8);
        // obj.setRadius(6);
        System.out.println("Radius is : "+obj.getRadius());
        // obj.setHeight(8);
        System.out.println("Height is : "+obj.getHeight());

        // Q2 ...
        System.out.println("Surface Area of Cylinder : "+obj.surfaceAreaOfCylinder());
        System.out.println("Volume of Cylinder : "+obj.volumeOfCylinder());

        // Q3 ...
        Rectangle r1 = new Rectangle(8,12);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
        
        // Q4 ...
        Sphere sp1 = new Sphere();
        sp1.setRadius(5);
        System.out.println("Radius of Sphere : "+sp1.getRadius());
        System.out.println("Surface Area of Sphere : "+sp1.areaOfSphere());
    }
}