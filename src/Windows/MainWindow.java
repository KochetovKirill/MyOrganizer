package Windows;

import Data.Diary;
import Data.Event;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class MainWindow{
    public static void show(Diary myDiary){
        Stage window = new Stage();
        window.setTitle("My Diary");

        ArrayList<Label> labels = new ArrayList<Label>();
        for (int i = 1; i <= myDiary.amount; i++)
        {
            labels.add(i, new Label(myDiary.Diarray.get(i).description));
        }

        Button button1 = new Button("add event");
        button1.setOnAction(e ->{
            myDiary.add(new Event(new GregorianCalendar(1, 1, 1),
                                  new GregorianCalendar(1, 1, 1),
                                  "this is event"));
        });

        VBox root = new VBox(button1);
        root.getChildren().addAll(labels);
        Scene scene = new Scene(root, 400, 400);
        window.setScene(scene);
        window.show();
    }
}
