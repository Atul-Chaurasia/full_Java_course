import java.util.ArrayDeque;
import java.util.Iterator;

public class AboutArrayDeque {

    public static void main(String[] args) {
        
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.add(1);
        adq.add(2);
        adq.add(3);
        adq.addFirst(4);
        adq.clear();
        adq.addLast(5);
        adq.add(6);
        System.out.println("size of array deque is: "+adq.size());
        adq.remove();

        Iterator itr = adq.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}