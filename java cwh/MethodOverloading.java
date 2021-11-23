class MethodOverloading{

    static void randomMsg() {
        System.out.println("Hello Guys ...");
    }
    static void change(int x) {
        x = 80;
    }
    static void changeArray(int [] array) {
        array[0] = 98;
    }

    // Method overloading --> same name but different parameters.

    static void doo(){
        System.out.println("Hello World !");
    }

    static int doo(int y){
        System.out.println(y+ " This is integer");
        return y;
    }

    static void doo(int a, int b, int c){
        System.out.println("first value "+a+" second value "+b+" third value "+c);
    }

    public static void main(String[] args) {

        randomMsg(); 

        // int [] marks = {45,56,87,59,82};

        //Case 1: Changing the integer.
        /*int a = 40;
        change(a);       // can not change the value of x.
        System.out.println("The value of a after change is : "+a);*/

        //Case 2: Changing the array.
        /*int [] marks = {65,76,87,89,61};
        changeArray(marks);
        System.out.println("after changing array is : "+marks[0]);*/

        // Method Overloading.
        doo();
        doo(1);
        doo(1,2,3);

        // method overloading can not perform to change the return type of method
    }
}