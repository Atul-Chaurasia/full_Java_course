import java.util.Calendar;

public class AboutCalender {

    public static void main(String[] args) {
    
        Calendar cal = Calendar.getInstance();
        
        System.out.println(cal.get(Calendar.SECOND));
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
    }
}