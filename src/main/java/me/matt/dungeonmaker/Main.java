package me.matt.dungeonmaker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //todo info needed to create the page.
    //page length, number of buttons x/y, room attempts, minroomx, maxroomx, minroomy, maxroomy, repeat chance
    //optional: colors of (wall, tunnel, room, finalroom, connector
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("fxml/menu.fxml"));
        primaryStage.setTitle("Dungeon Maker Settings");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
