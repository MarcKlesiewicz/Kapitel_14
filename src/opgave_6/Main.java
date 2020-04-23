package opgave_6;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        String image;
        int tileNum = 0;


        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                if (tileNum % 2 == 0) {
                    image = "opgave_6/image/wTile.JPG";
                } else {
                    image = "opgave_6/image/bTile.JPG";
                }
                pane.add(new ImageView(new Image(image)), j, i);
                tileNum++;

                if (tileNum == 10){
                    tileNum++;
                }else if (tileNum > 20 ){
                    tileNum = 0;
                }

            }

        }

        Scene scene = new Scene(pane, 600, 600);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


