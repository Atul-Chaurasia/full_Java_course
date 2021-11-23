class BreakStatement
{
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++)
        {
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }

        // int i = 1;
        // while(i<=5){
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println(i);
        //     i++;
        // }

        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=5);
    }
}