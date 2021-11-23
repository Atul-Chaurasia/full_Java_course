class MultidimensionalArray
{
    public static void main(String[] args) 
    {
        // int [] marks = {34,54,65,76,98};  //--> 1-d array
        
        int [][] flats = new int [2][3];   // [2]-->Rows [3]-->Column.
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201; 
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i=0; i<flats.length; i++){    //--> outer loop describe total 
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }                                  //--> rows and column
            System.out.println();            
        }
    }
}