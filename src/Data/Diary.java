package Data;

import java.io.Serializable;
import java.util.ArrayList;

public class Diary implements Serializable {
    ArrayList<Event> Diarray = new ArrayList<Event>();
    long amount = Event.amount;

    public Diary(ArrayList<Event> inArray, long inAm) {
        Diarray = inArray;
        amount = inAm;
    }
    public Diary(){
    }

    public void sort(){
        //sorts array Diarray
    }
}
