class Recursion{

    // factorial(0) = 1
    // factorial(n) = n*n-1....1
    // factorial(5) = 5*4*3*2*1 = 120
    // factorial(n) = n*factorial(n-1)
    
    static int factorial(int n)
    {
        if(n==0 || n==1){       // factorial by recursive method
            return 1;
        }
        else{
            return n * factorial(n-1);         // n to 1.
        }
    }

    static int factorial_iterative(int num)
    {
        if(num == 0 || num == 1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1; i<=num; i++){          // 1 to n.
                product = product * i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        
        int x = 5;
        System.out.println("The factorial is : "+factorial(x));

        int y = 5;
        System.out.println("Using iterative factorial is : "+factorial_iterative(y));
    }
}