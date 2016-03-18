package Data;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Event {
    static long amount;
    long id;
    String description;
    Calendar date;

    public Event(int day, int month, int year, String text){
        id = amount;
        amount = amount + 1;
        date =  new GregorianCalendar(year, month, day);
        description = text;
    }

    public Event(int minute, int hour, int day, int month, int year, String text){
        id = amount;
        amount = amount + 1;
        date =  new GregorianCalendar(year, month, day, hour, minute);
        description = text;
    }
}
