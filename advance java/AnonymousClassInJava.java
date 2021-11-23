interface myInter {
    void meth(int a, int b);  
    void meth1();  
}
// class ImplementClass implements myInter {

//     public void meth(int a, int b){
//         System.out.println(a+b);
//     }

//     public void meth1(){
//         System.out.println("This is meth1");
//     } 
// }

public class AnonymousClassInJava {
    public static void main(String[] args) {
        
        myInter obj = new myInter() {
            public void meth(int a,int b){
                System.out.println(a+b);
            }

            public void meth1(){
                System.out.println("This is Anonymous class");
            }
        };
        obj.meth(1,2);
        obj.meth1();
       
    }
}