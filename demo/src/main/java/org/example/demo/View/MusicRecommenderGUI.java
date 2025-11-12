package org.example.demo.View;

import javafx.collections.ObservableList;
import org.example.demo.Model.ServerConnection;
import org.example.demo.Model.Track;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.*;

import java.io.IOException;

/**
 * Main GUI application for the Music Recommender System
 * Demonstrates Java Swing GUI components and event handling
 */
public class MusicRecommenderGUI extends Application {
    private TextField searchField;
    private Button searchButton;
    private ListView<Track> searchResultsList;
    private ListView<Track> recommendationsList;
    private Label statusLabel;

    private ObservableList<Track> searchResultsModel;
    private ObservableList<Track> recommendationsModel;

    private ServerConnection serverConnection;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MusicRecommenderGUIFX.class.getResource("MainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
