class Employee {

    int salary;
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}
class Cellphone {
    
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
    public void callFriend() {
        System.out.println("call Rajesh...");
    }
}
class Square {
    int side;

    public int areaOfSquare() {
        return side*side;
    }
    public int perimeterOfSqur() {
        return 4*side;
    }
}
class Rectangle {
    int length , width;

    public int areaOfRectangle() {
        return length*width;
    }
    public int perimeterOfRec() {
        return 2*(length+width);
    }
}
class ViceCity {

    public void hit() {
        System.out.println("Hitting to Enemy");
    }
    public void run() {
        System.out.println("Running from Enemy");
    }
    public void fire() {
        System.out.println("Firing on Enemy");
    }
}
class Circle {
    float pi = 3.14f;
    int radius;

    public float areaOfCircle(){
        return pi*(radius*radius);
    }
    public float perimeterOfCircle(){
        return 2*(pi*radius);
    }
}
public class PracticeSet8 {
    public static void main(String[] args) {
        // Q1...
        /*Employee emp = new Employee();

        emp.setName("Atul");
        // System.out.println(emp.setName());
        System.out.println(emp.getName());

        emp.salary = 6000;
        System.out.println(emp.getSalary());*/

        // Q2...
        /*Cellphone samsung = new Cellphone();

        samsung.ring();
        samsung.callFriend();
        samsung.vibrate();*/

        // Q3...
        /*Square sq1 = new Square();

        sq1.side = 5;
        System.out.println("Area of Square "+sq1.areaOfSquare());
        
        System.out.println("Perimeter of Square "+sq1.perimeterOfSqur());*/

        // Q4...
        /*Rectangle rec1 = new Rectangle();

        rec1.length=4;
        rec1.width=3;
        System.out.println("Area of Rectangle "+rec1.areaOfRectangle());

        System.out.println("Perimeter of Rectangle "+rec1.perimeterOfRec());*/

        // Q5...
        /*ViceCity player1 = new ViceCity();

        player1.run();
        player1.fire();
        player1.hit();*/

        // Q6...
        Circle cir1 = new Circle();

        cir1.radius = 3;
        System.out.println("Area of Circle "+cir1.areaOfCircle());

        System.out.println("Perimeter of Circle "+cir1.perimeterOfCircle());
    }
}