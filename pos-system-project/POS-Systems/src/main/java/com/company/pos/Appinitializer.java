package com.company.pos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Appinitializer extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Assuming Login.fxml is in the resources/view directory
            URL url = getClass().getClassLoader().getResource("view/LoginForm.fxml");

            if (url == null) {
                System.err.println("Error: Could not load FXML file");
                System.exit(1);
            }

            Parent root = FXMLLoader.load(url);
            primaryStage.setTitle("Login Application");
            primaryStage.setScene(new Scene(root, 1024, 764));
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Error: Unable to load FXML file");
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
