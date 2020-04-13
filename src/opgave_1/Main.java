package opgave_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("opgave_1/DisplayImages.fxml"));
        primaryStage.setTitle("Display Images");
        primaryStage.setScene(new Scene(root, 640,400));
        primaryStage.show();

    }


}
