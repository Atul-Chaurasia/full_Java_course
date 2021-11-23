import java.util.Date;

public class AboutDate {
    public static void main(String[] args) {
        
        // these all methods of Date class are depricated.

        // Date d = new Date();
        Date d = new Date(2021, 11, 12);
        System.out.println(d.getDate());
        // System.out.println(d.getDay());
        // System.out.println(d.getHours());
        System.out.println(d.getTime());
    }
}