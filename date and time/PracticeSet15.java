import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.HashSet;
import java.util.Iterator;

public class PracticeSet15 {
    public static void main(String[] args) {
        
        // Q1.....
        // ArrayList<String> ar = new ArrayList<>();
        // ar.add("Stu1");
        // ar.add("Stu2");
        // ar.add("Stu3");

        // for(String str : ar) {
        //     System.out.println(str);
        // }

        // // Q2....
        // Date d = new Date();
        // System.out.println(d.getHours() +":"+d.getMinutes() +":"+ d.getSeconds());

        // Q3...
        // Calendar cal = Calendar.getInstance();
        // System.out.println(cal.get(Calendar.HOUR)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
        
        // Q4...
        // String[] id = TimeZone.getAvailableIDs();        
        // System.out.println("In TimeZone class available Ids are: ");  
        // for (int i=0; i<id.length; i++){  
        // System.out.println(id[i]);  
        // } 
        
        // Q5...
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);  
        hs.add(2);  
        hs.add(1);  
        hs.add(3);
        
        Iterator itr = hs.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}