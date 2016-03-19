package Data;

import java.io.Serializable;
import java.util.ArrayList;

public class Diary implements Serializable {
    public ArrayList<Event> Diarray = new ArrayList<Event>();
    public int amount = Event.amount;

    public Diary(ArrayList<Event> inArray) {
        Diarray = inArray;
        amount = Event.amount;
    }
    public Diary(){
    }

    public void add(Event smth){
        amount += 1;
        Diarray.add(amount, smth);
    }
}
