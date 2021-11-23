class StaticMethod{

        /* inside main method yadi hum without creating object
        koi bhi method call karte hai toh tho static
        method ki help leni padti hai
        static method se static method hi call kar sakte hai */

    // int logic(int x, int y)
    static int logic(int x, int y)
    {
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y)*2;
        }
        return z;
    }

    public static void main(String[] args) {
        
        // StaticMethod obj = new StaticMethod();    // creating object

        int a = 5 , b = 7;

        // Method invocation using object creation.
        // int c = obj.logic(a, b);

        int c = logic(a, b);  // c = 24
        System.out.println(c);


        int a1 = 7 , b1 = 5;

        // int c1 = obj.logic(a1, b1);

        int c1 = logic(a1, b1);
        System.out.println(c1);

    }
}
