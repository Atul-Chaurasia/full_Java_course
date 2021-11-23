import java.util.Scanner;

public class ThrowAndThrows {

    public static void func1() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value first: ");
        int a = sc.nextInt();
        System.out.print("Enter Value second: ");
        int b = sc.nextInt();
        
        System.out.println("Result is: "+a/b);
    }

    public static void main(String[] args) {
        
        try {
            ThrowAndThrows.func1();            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
            
    }
    
}
