class ArrayIntroPart2
{
    public static void main(String[] args) {
        
        // int [] marks = {45,65,32,54,76};
        /* float [] marks = {45.5f,65.0f,32.5f,54.5f,76.5f};
        
        System.out.println(marks.length);
        System.out.println(marks[4]); */


        // Displaying the Array
        
        int [] num = {34,54,65,76,87};
        // 1. Naive way to display elements of array

        // System.out.println(num[0]);
        // System.out.println(num[1]);
        // System.out.println(num[2]);
        // System.out.println(num[3]);
        // System.out.println(num[4]);

        // 2. Using for loop.

        // for(int i=0; i<num.length; i++){     // --> Array traversal.
        //     System.out.println(num[i]);
        // }

// /////////////////////////////////////////////////////////////////////////

        // Print Array in reverse order.
        // for(int j=num.length-1; j>=0;  j--){
        //     System.out.println(num[j]);
        // }

        // for:each loop.

        for(int elements : num){
            System.out.println(elements);
        }

    }
}