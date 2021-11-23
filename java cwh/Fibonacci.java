import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println(a+ " ");
        System.out.println(b+ " ");

        for(int i=1; i<=n-2; i++)
        {
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}