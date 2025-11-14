package org.example.demo.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

import java.io.IOException;


public class MusicRecommenderGUIFX extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {

            HBox hbox = new HBox();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/example/demo/MainScreen.fxml"));
            Parent mainScreen = loader.load();
            //hbox.getChildren().add(mainScreen);
            //HBox.setHgrow(hbox, Priority.ALWAYS);
            //Scene newScene = new Scene(hbox);
            //hbox.setAlignment(Pos.CENTER);
            primaryStage.setWidth(1000);
            primaryStage.setHeight(700);
            //hbox.setBackground(Background.fill(Color.web("#292929")));
            primaryStage.setScene(new Scene(mainScreen));
            primaryStage.setTitle("Spotify Music Recommender");
            primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
