/*Rules for get and set method.
    --> make variable private.
    --> and create get and set method.*/

class Employee {
    private int id;
    private String name;
    private int age;

    public int getId(){
        return id;
    }    
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age > 24 || age < 18){
            System.out.print("You are not capable for Job...");
        }
        else{
            this.age = age;
        }
    }
}

public class GetterSetterMethod {
    public static void main(String[] args) {
    
        Employee emp1 = new Employee();
        // emp1.id = 1;    // to restrict the direct access of variable by using object we can use getter and setter method.
        // emp1.name = "Atul";
        // System.out.println(emp1.id);
        // System.out.println(emp1.name);

        emp1.setId(1);
        System.out.println(emp1.getId());
        
        emp1.setName("Atul");
        System.out.println(emp1.getName());
        
        emp1.setAge(21);
        System.out.println(emp1.getAge());
    }
}
