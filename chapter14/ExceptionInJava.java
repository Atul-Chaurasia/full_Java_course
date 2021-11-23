import java.util.Scanner;

public class ExceptionInJava{

    public static void main(String[] args) {
        
        // int a = 8;
        // int b = 2;
        // int sum = a+b;
        // System.out.println("The sum of "+a+" and "+b+" is :" +sum);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value first: ");
        int a=0;
        int b=0;
        
        try {
            a = sc.nextInt();
        } 
        catch (Exception e) {
            System.out.println("...Enter Valid Number...");
        }
    
        System.out.print("Enter Value Second: ");
        try {
            b = sc.nextInt();
            
        } 
        catch (Exception e) {
            System.out.println("...Enter Valid Number...");
        }   
        finally{
            System.out.println("GOOD BYE");
        }

        System.out.println("The sum of "+a+" and "+b+" is : "+(a+b));

    }
}

        

            