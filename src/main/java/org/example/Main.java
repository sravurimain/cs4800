package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button openFormButton = new Button("Add Student");
        openFormButton.setOnAction(e -> new StudentForm().show());

        StackPane layout = new StackPane(openFormButton);
        Scene scene = new Scene(layout, 250, 150);
        primaryStage.setTitle("Library System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
