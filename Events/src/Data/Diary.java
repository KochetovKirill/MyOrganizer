package Data;

import java.io.Serializable;
import java.util.ArrayList;

public class Diary implements Serializable {
    public ArrayList<Event> Diarray = new ArrayList<Event>();
    public int amount = Event.amount;

    public Diary(ArrayList<Event> inArray, int inAm) {
        Diarray = inArray;
        amount = inAm;
    }
    public Diary(){
    }

    public void add(Event smth){
        amount += 1;
        Diarray.add(amount, smth);
    }
}
