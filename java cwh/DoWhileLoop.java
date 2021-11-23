import java.util.Scanner;
class DoWhileLoop
{
    public static void main(String[] args) 
    {
        // int i = 6;

        // do{                                    // do-while run at least one time
        //     System.out.println("Hello world");
        //     i++;
        // }while(i<=5);
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        int i =1;
        
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
            
    }
}