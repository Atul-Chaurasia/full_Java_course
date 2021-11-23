import java.util.Scanner;
class WhileLoop
{
    public static void main(String[] args) 
    {
        // int i = 1;                     
        // while(i<=5)
        // {
        //     System.out.println(i);
        //     i++;
        // }    

        // int n = 100;
        // while(n<=200)
        // {
        //     System.out.println(n);
        //     n++;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();
        int i = 1;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
    }
}