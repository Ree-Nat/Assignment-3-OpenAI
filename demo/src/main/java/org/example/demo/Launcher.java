package org.example.demo;

import javafx.application.Application;
import org.example.demo.View.MusicRecommenderGUIFX;

import java.io.IOException;

public class Launcher {
    public static void main(String[] args) throws IOException {
        launch(args);
    }
    /*
     * Launches wordle game in the class MusicRecommenderGUIFX.class
     * @param args a String array object
     * @throws IOException if main scene and class does not exist
     */
    public static void launch(String[] args) throws IOException {
        //String apiKey = System.getenv("OPENAI_API_KEY");
        //System.out.println(apiKey);
        Application.launch(MusicRecommenderGUIFX.class, args);
    }
}

