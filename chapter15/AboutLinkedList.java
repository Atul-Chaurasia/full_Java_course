import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class AboutLinkedList{

    public static void main(String[] args) {
        
        ArrayList<String> ar = new ArrayList<>();
        LinkedList<String> ar1 = new LinkedList<>();

        // ar.add("Atul");
        // ar.add("Chaurasia");
       
        ar1.add("Anuj");
        ar1.add("Kailash");

        // ar.addAll(ar1);
        // ar1.clear();
        // System.out.println(ar.get(0));
        System.out.println(ar1.isEmpty());
        // System.out.println(ar.lastIndexOf(ar1));
        // System.out.println(ar.contains("Atul"));
        // System.out.println("Removed element: "+ar.remove(1));
        // ar.set(0,"Zack");

        ar1.addLast("John");     // these methods are not in ArrayList
        ar1.offer("Offer method");
        ar1.addFirst("Sachin");
        System.out.println("peek method: "+ar1.peek());
        ar1.poll();  //retrive first element from list.

        Iterator<String> itr = ar1.iterator();  
        while(itr.hasNext()){                  //to print all the elements of list
         System.out.println(itr.next());  
        }  


        // for(int i = 0; i<ar.size(); i++) {
        //     System.out.println(ar.get(i));
        // }
        // for(int j = 0; j<ar1.size(); j++) {
        //     System.out.println(ar1.get(j));
        // }

        // String [] student = new String[5]; 
        // student[0] = "Atul";
        // student[1] = "Anil";
        // student[2] = "Akash";
        // student[3] = "Ajay";
        // student[4] = "Aman";

        // for(int i=0; i<student.length; i++) {
        //     System.out.println(student[i]);
        // }
        
    }
}