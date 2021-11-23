class VarArgs{

    // static int sum(int x, int y){
    //     return x+y;
    // }
    // static int sum(int x, int y, int z){
    //     return x+y+z;
    // }
    // static int sum(int x, int y, int z, int a){
    //     return x+y+z+a;
    // }
    // static int sum(int x, int y, int z, int a, int b){
    //     return x+y+z+a+b;
    // }

    static int sum(int x, int ...array){    // here int x is compulsory it is optional
        int result=x;                       // available in array form
        for(int n : array){
            result = result+n;
        }
        return result;
    }
    public static void main(String[] args) {
        

        System.out.println(sum(2));
        System.out.println(sum(2,3));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2,3,4,5));
    }
}