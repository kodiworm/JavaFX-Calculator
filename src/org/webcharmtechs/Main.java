package org.webcharmtechs;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("calculatorView.fxml"));
        Scene scene = new Scene(root, 400, 400);
        scene.getStylesheets().add(getClass().getResource("stylesheet.css").toExternalForm());

        primaryStage.setTitle("CalculatorFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
