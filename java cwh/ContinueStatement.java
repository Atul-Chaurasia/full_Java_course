class ContinueStatement
{
    public static void main(String[] args) {
        
        for(int i=1; i<=5; i++)
        {
            if(i==3){
                continue;
            }
            System.out.println(i);
        }

        // int i=0;
        // while(i<=5)
        // {   
        //     i++;
        //     if(i==4){
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // int i=0;
        // do{
        //     i++;
        //     if(i==3){
        //         continue;
        //     }
        //     System.out.println(i);
        // }while(i<=5);
    }
}