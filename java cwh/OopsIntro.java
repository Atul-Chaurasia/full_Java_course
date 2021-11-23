class Employee {
    int id;
    String name;
    int salary;

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}


public class OopsIntro {
    public static void main(String[] args) {
        
        Employee emp1 = new Employee();

        // emp1.name = "Ramesh";
        // System.out.println(emp1.name);
        // System.out.println(emp1.getSalary());

        emp1.setSalary(5000);
        // System.out.println(emp1.setSalary);
        System.out.println(emp1.getSalary());
    }
}