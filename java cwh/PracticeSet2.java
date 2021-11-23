import java.util.Scanner;
class PracticeSet2
{
    public static void main(String[] args) 
    {
        // Q1. Solve the expression.
        // float f = 7/4 * 9/2;   // --> 4.0 ans because 7/4 and 9/2 are given integer value .

        // float f = (float)7/4 * (float)9/2; // --> here we do typecasting
        //          1.75 * 9/2
        //          15.75/2
        //          7.875

        // float f = 7/4.0f * 9/2.0f; // --> it is another way to get the correct ans.
        
        // System.out.println(f);

// ###############################################################################################

        // Q2. encrypt grade by 8 and then decrypt it.

        // System.out.print("Enter your Grade : ");
        // Scanner sc = new Scanner(System.in);
        // char e  = sc.next().charAt(0);
        // // c += 8;
        // e = (char)(e + 8);
        // System.out.println("After Encrypting your Grade is : "+e);

        // // Decrypt the Grade.
        // e = (char)(e - 8);
        // System.out.println("After Encrypting your Grade is : "+e);

// ###############################################################################################

        // Q3. compare the user entered no. is greater than given no.
        
        // int a = 12;
        // Scanner sc = new Scanner(System.in);
        // int b = sc.nextInt();
        // System.out.println(a > b);

        
        // Q4. write expression.

        // int v = 4, u = 3 , a = 1, s = 4;
        // int total = (v*v - u*u) / (2*a*s);
        // System.out.println(total);

        // Q5. find the value of expression
        // int x= 7;
        // int a = 7*49/7+35/7;
        // System.out.println(a);
    }
}