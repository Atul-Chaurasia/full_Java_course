import java.util.ArrayList;

public class AboutArrayList{

    public static void main(String[] args) {
        
        ArrayList<String> ar = new ArrayList<>();
        ArrayList<String> ar1 = new ArrayList<>();

        ar.add("Atul");
        ar.add("Chaurasia");
       
        ar1.add("Anuj");
        ar1.add("Kailash");

        ar.addAll(ar1);
        ar1.clear();
        System.out.println(ar.get(0));
        System.out.println("\t"+ar1.isEmpty());
        // System.out.println(ar.lastIndexOf(ar1));
        System.out.println(ar.contains("Atul"));
        System.out.println("Removed element: "+ar.remove(1));
        ar.set(0,"Zack");

        
        for(int i = 0; i<ar.size(); i++) {
            System.out.println(ar.get(i));
        }
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