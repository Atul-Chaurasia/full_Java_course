import java.lang.Math;
class PracticeSet6
{
    public static void main(String[] args) {
        
        // Q1. sum all numbers of float [5] array.

        // float marks [] = {34.5f,56.5f,65.3f,76.4f}; 

        // float sum = 0;
        // for(int i=0; i<marks.length; i++){
        //     sum = sum+marks[i];

        // for(float elements : marks){       // --> by using for:each loop.
        //     sum = sum + elements;
        // }
        // System.out.println(sum);

        // Q2. find weather a number is present in array or not.

        // float [] marks = {34.5f,56.5f,65.3f,76.4f}; 
        // float num = 34.5f;
        // boolean isInArray = false;
        // for(float elements : marks){
        //     if(num == elements){
        //         isInArray = true;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("Value is present in Array");
        // }
        // else{
        //     System.out.println("Value is not present in Array");
        // }

        // Q3. in notes.

        // int [] marks = {54,65,87,45,89};
        // int sum = 0;
        // for(int elements : marks){
        //     sum = sum + elements;
        // }
        // System.out.println("The value of Average marks is " +sum/marks.length);

        // Q4. adding 2-d array elements.

        // int [][] mat1 = {{1, 2, 3},
        //                  {4, 5, 6}};
        // int [][] mat2 = {{2, 6, 8},
        //                  {7, 9, 4}};
        // int [][] result = {{0, 0, 0},
        //                    {0, 0, 0}};
                        
        // for(int i=0; i<mat1.length; i++)  // row number of time
        // { 
        //     for(int j=0; j<mat1[i].length; j++) // column no. of time
        //     { 
        //         result[i][j] = mat1[i][j]+mat2[i][j];
        //         System.out.print(result[i][j] + " ");
        //     }
        //     System.out.println();
        // }            

        // Q5. program to reverse an array

        // int a = 25, b = 5;
        // System.out.println(Math.floorDiv(a, b));

        // Q6. program to find the maximum element in array.

        // int [] numbers = {23,54,65,76,87,26};
        // int maxi = 0;
        // int maxi = Integer.MIN_VALUE; 
        // for(int i : numbers){
        //     if(i>maxi){
        //         maxi = i;
        //     }
        // }
        // System.out.println("Maximum element of Array is "+maxi);

        // Q7. program of finding minimum element in array.

        // int [] num = {32,436,7,87,54,2};
        // int min = Integer.MAX_VALUE;      //--> Integer.MAX_VALUE --> return 
        // for(int n : num){                 //    the minimum value and 
        //     if(min>n){                    //    Integer.MIN_VALUE --> return
        //         min = n;                  //    the maximum value            
        //     }
        // }
        // System.out.println(min);

        // Q8. check the array is sorted or not

        int [] number = {1,2,3,5,74,93};
        boolean isSorted = true;
        for(int i=0; i<number.length-1; i++){
            if(number[i] > number[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted : "+isSorted);
        }
        else{
            System.out.println("Array is Not Sorted : "+isSorted);
        }



    }   
}