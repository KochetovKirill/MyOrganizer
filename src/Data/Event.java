package Data;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Event {
    static int amount;
    int id;
    public String description;
    public Calendar dateStart;
    public Calendar dateEnd;

    public Event(GregorianCalendar start, GregorianCalendar end, String text){
        id = amount;
        amount += 1;
        dateStart = start;
        dateEnd = end;
        description = text;
    }
}
