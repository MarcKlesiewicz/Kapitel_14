package opgave_2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){

        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3 ; j++) {
                int random = (int)(Math.random() * 3);
                if (random != 2){
                    String image = (random > 0) ? "opgave_2/image/x.png" : "opgave_2/image/o.png";
                    pane.add(new ImageView(new Image(image)), j, i );
                }

            }

        }

        Scene scene = new Scene(pane, 600,600);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
