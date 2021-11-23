import java.util.Scanner;
class PracticeSet7{

    // static void TableOf(int x)
    // {
    //     if(x<=0){
    //         System.out.println("Negative value not allow");
    //     }
    //     else
    //     {       
    //         for(int i=1; i<=10; i++)
    //         {
    //             // System.out.format("%d * %d = %d\n", x, i, x*i);
    //             System.out.println(x*i);
    //         } 
    //     }
    // }

    //////////////////////////////////////////////////////////////////////

    // static void pattern(int x){
    //     for(int i=1; i<=x; i++){
    //         for(int j=1; j<=i; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    //////////////////////////////////////////////////////////////////////

    // static int sumOfNaturalNum(int x){
    //     if(x == 1){
    //         return 1;
    //     }
    //     else{
    //         return x + sumOfNaturalNum(x-1);
    //     }
    // }

    ///////////////////////////////////////////////////////////////////////

    // static void pattern1(int x){
    //     for(int i=1; i<=x; i++){
    //         for(int j=1; j<=x-i+1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // ////////////////////////////////////////////////////////////////////

    // static int fibonacciOf(int x){
        /*if(x == 1)
        {
            return 0;
        }
        else if(x == 2)
        {
            return 1;
        }*/
    //     if(x == 1 || x ==2){
    //         return x-1;
    //     }
    //     else
    //     {
    //         returin fibonacciOf(x-1) + fibonacciOf(x-2);
    //     }
    // }

    /////////////////////////////////////////////////////////////////////

    // static int sumOf(int ...array)
    // {
    //     int sum=0;
    //     for(int n  : array)
    //     {
    //         sum = sum+n;
    //     }return sum;
    // }

    ///////////////////////////////////////////////////////////////////////////

    //  static void patternRecr(int x)
    //  {
    //      if(x > 0){

    //        patternRecr(x-1);

    //         for(int i=0; i<x; i++){
                
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    }
    public static void main(String[] args) 
    {
        // Q1...
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // TableOf(n);

        // Q2...
        // pattern(5);

        // Q3...
        // int n = 4;
        // System.out.println(sumOfNaturalNum(n));

        // Q4...
        // pattern1(5);
        
        // Q5...
        // int n = 4;
        // System.out.println(fibonacciOf(n));

        // Q6...
        // System.out.println(sumOf(2,4));

        // Q7...
        // int n = 5;
        // patternRecr(n);
    }
}