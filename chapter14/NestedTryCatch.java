import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        
        
        int [] marks = new int[3];
        marks[0] = 65;
        marks[1] = 56;
        marks[2] = 76;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input: ");
        int index = sc.nextInt();

        try {
            System.out.println("Welcome");

            try {
                System.out.println(marks[index]);
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception in Inside");
            }

        } 
        catch (Exception e) {
            System.out.println("Exception in outside");    
        }
    }
}