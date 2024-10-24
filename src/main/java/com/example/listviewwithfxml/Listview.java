package com.example.listviewwithfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Listview extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load the FXML file
        Parent root = FXMLLoader.load(getClass().getResource("listview.fxml"));

        // Set the title of the window
        primaryStage.setTitle("ListView Example");

        // Create a scene with the loaded FXML layout
        primaryStage.setScene(new Scene(root, 300, 300));

        // Show the window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
