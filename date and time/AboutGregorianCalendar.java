import java.util.Calendar;
import java.util.GregorianCalendar;

public class AboutGregorianCalendar {

    public static void main(String[] args) {
        
        Calendar calendar = Calendar.getInstance();

        System.out.println("TIME: " + calendar.getTime());
        // System.out.println("ERA: " + calendar.get(Calendar.ERA));
        // System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        // System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        // System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        // System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
        // System.out.println("DATE: " + calendar.get(Calendar.DATE));
        // System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
        // System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        // System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2021));
    }
}