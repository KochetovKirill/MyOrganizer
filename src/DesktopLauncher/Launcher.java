package DesktopLauncher;

import javafx.application.Application;
import javafx.stage.Stage;
import Data.Diary;
import Data.Event;
import Windows.MainWindow;

import java.util.GregorianCalendar;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Diary myDiary = new Diary();
        MainWindow.show(myDiary);
    }
}
