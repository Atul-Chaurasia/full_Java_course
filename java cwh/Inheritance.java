class Animal {
    private int legs;
    private String color;
    // private int eyes;

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("Walking...");
    }
    public void eat() {
        System.out.println("Eating...");
    }
}
class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void dogBark() {
        System.out.println("Dog is Barking...");
    }
}
public class Inheritance {
    public static void main(String[] args) {
 
        // Animal obj = new Animal();
        // obj.setLegs(4);
        // obj.setColor("Brown");
        // System.out.println("Legs = "+obj.getLegs());
        // System.out.println("Color = "+obj.getColor());

        Dog obj1 = new Dog();

        obj1.setLegs(4);
        System.out.println("Legs : "+obj1.getLegs());

        obj1.setBreed("Poodle");
        System.out.println("Dog Breed : "+obj1.getBreed());

        obj1.dogBark();
    }
}