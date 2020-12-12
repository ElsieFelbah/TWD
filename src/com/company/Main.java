package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource( "entry.fxml"));
        primaryStage.setTitle("Products");
        primaryStage.setScene(new Scene(root, 697, 530));
        primaryStage.show();
    }


    public static void main(String[] args) {launch(args);
    }
}
