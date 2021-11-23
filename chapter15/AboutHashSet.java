import java.util.HashSet;
import java.util.Iterator;

public class AboutHashSet {

    public static void main(String[] args) {
        
        HashSet<Integer> hs = new HashSet<>();

        hs.add(5);
        hs.add(4);
        hs.add(3);
        hs.add(5);
        // hs.isEmpty();

       Iterator itr = hs.iterator();
       while(itr.hasNext()) {
           System.out.println(itr.next());
       }
    }
} 