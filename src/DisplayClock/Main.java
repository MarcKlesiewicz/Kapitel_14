package DisplayClock;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;

import java.awt.*;

public class Main extends Application {

    public void start(Stage primaryStage){

        ClockPane clock = new ClockPane();
        String timeString = clock.getHour() + " : " + clock.getMinute() + " : " + clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);


        Scene scene = new Scene(pane, 250, 250);
        primaryStage.setTitle("Display Clock");
        primaryStage.setScene(scene);
        primaryStage.show();




    }

}
