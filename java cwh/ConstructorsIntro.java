public class ConstructorsIntro {

    private int id;
    private String name;
    private int age;

    ConstructorsIntro(int id,String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
    
        ConstructorsIntro obj1 = new ConstructorsIntro(1,"Atul",20);
        
        System.out.println("Id : "+obj1.id+"\nName : "+obj1.name+"\nAge : "+obj1.age);
    }
}