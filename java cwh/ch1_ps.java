import java.util.Scanner;
class Ch1_ps
{
    public static void main(String[] args) {

        // Q1. Add three numbers.
        // int num1=45, num2=43, num3=56, total;
        // total=num1+num2+num3;
        // System.out.println("Total is : "+total);

        // Q2. Calculate CGPA of three subjects out of 100.
        // float num1=76, num2=65, num3=56, total;
        // total=num1+num2+num3;
        // System.out.println("Total is : "+total);
        // // float cgpa = (total)/30;
        
        // float cgpa = (total*10)/300;
        // System.out.println("CGPA is : "+cgpa);

        // Q3. take input from user and print "Hello, <Name> have a good day".
        // System.out.println("Please Enter your name : ");
 
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // System.out.print("Hello, " + str + " have a good day !");

        // Q4. convert miles to kilometer.
        
        // System.out.print("Enter Km which you want to convert in miles :");
        // Scanner sc1 = new Scanner(System.in);
        // float km = sc1.nextFloat();
        // float miles = km*0.62137f;
        // System.out.print("In "+km+" km the no. of Miles is : "+miles);

        // Q5. to detect user input no. is integer or not.

        System.out.println("Enter any number : ");
        Scanner sc2 = new Scanner(System.in);
        System.out.println(sc2.hasNextInt());
    }
}