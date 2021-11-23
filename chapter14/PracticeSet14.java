import java.util.Scanner;
public class PracticeSet14 {

    public static void main(String[] args) {
        
        // int i = 1  --> syntax error
        // System.out.println(5/0);   --> runtime error

        // int a = 4;
        // int b = 0;

        // try {
        //     int c = a/b;
        //     System.out.println(c);
        // } 
        // catch (ArithmeticException e) {
        //     System.out.println("Haha");
        // }
        // catch (IllegalArgumentException e) {
        //     System.out.println("Haha"+e);
        // }

        int marks[] = new int[3];
        marks[0] = 54;
        marks[1] = 56;
        marks[2] = 76;

        Scanner sc = new Scanner(System.in);
        
        int i = 0; 

        boolean flag = true;
        while(flag && i<5) {

            try {
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is: "+marks[index]);
                break;
            } 
            catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }
        }
    }
}