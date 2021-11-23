import java.util.Scanner;

public class HandleException{
    public static void main(String[] args) {
        
        int [] marks = new int[3];
        marks[0] = 65;
        marks[1] = 56;
        marks[2] = 76;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Index");
        int index = sc.nextInt();


        System.out.println("Enter Number By Which You Want To Divide");
        int number = sc.nextInt();

        try {
            System.out.println("The value of array index "+marks[index]);
            System.out.println("The result is "+marks[index]/number);
        } 
        catch (ArithmeticException e) {
            System.out.println("Perform Right Operation");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please Enter Valid Index");
        }
        // catch (InputMismatchException e) {
        //     System.out.println("Please Enter Numbers not Alphabets");
        // }
        
    }
}