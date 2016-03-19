package Windows;

import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddEventWindow {
    public static void show() {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("New event");
        window.setMinHeight(300);
        window.setMinWidth(300);

    }
}
