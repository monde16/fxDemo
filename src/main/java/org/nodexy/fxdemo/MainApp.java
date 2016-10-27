package org.nodexy.fxdemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Created by phoenix on 10/27/16.
 */
public class MainApp extends Application {
    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    /*public static void main(String[] args) {
        Application.launch(args);
    }*/

    @Override
    public void start(Stage primaryStage) {
        // Create a scene and place a button onto the scene.
        Button btnOk = new Button("OK");
        Scene scene = new Scene(btnOk, 200, 250);
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("Click Me"), 200, 100));
        stage.setResizable(false);
        stage.show();
    }
}
