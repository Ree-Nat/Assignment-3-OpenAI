package org.example.demo.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import org.apache.hc.core5.http.ParseException;
import org.example.demo.Model.RandomStrategy;
import org.example.demo.Model.RecommendationEngine;
import org.example.demo.Model.SearchStrategy;
import org.example.demo.Model.Track;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainScreenController {

    public Button saveWorkButton;
    public Button loadRecentButton;
    @FXML
    ListView<String> musicReccomendationList;

    @FXML
    TextField searchByArtistTextField;
    /**
     * Clears music recommendations
     * @param actionEvent an ActionEvent button
     */
    @FXML
    public void clearListButton(ActionEvent actionEvent) {
        clearList();
    }

    /**
     * Populates list in musicRecommendationList
     * @param actionEvent an ActionEvent button
     */
    @FXML
    public void getRandomButton(ActionEvent actionEvent) throws IOException, ParseException {
        RecommendationEngine recommender = new RecommendationEngine(new RandomStrategy());
        List<Track> recommendedTracks = recommender.getRecommendations("", 1);
        addToList(recommendedTracks);
    }

    /**
     * Search Recommendation based on AI.
     * @param actionEvent a action event button
     */
    @FXML
    public void searchByAIButton(ActionEvent actionEvent) {
    }

    /**
     * Adds a group of tracks based on list
     * @param Tracks list of tracks to be added.
     */
    private void addToList(List<Track> Tracks)
    {
        for(Track item : Tracks)
        {
            musicReccomendationList.getItems().add(item.getAlbumName() +
                                                    ":" + item.getName());
        }
    }

    /**
     * Clears the list
     */
    private void clearList()
    {
        musicReccomendationList.getItems().clear();
    }

    /**
     * Search by recommendation by artist name
     * @param actionEvent
     */
    public void searchByArtist(ActionEvent actionEvent) throws IOException, ParseException {
        RecommendationEngine recommender = new RecommendationEngine(new SearchStrategy());
        String userInput = searchByArtistTextField.getText();
        List<Track> recommendedTracks = recommender.getRecommendations(userInput, 1);
        addToList(recommendedTracks);
    }

    /**
     * Saves work in current list
     * @param actionEvent
     */
    public void saveWork(ActionEvent actionEvent) throws IOException {

        List<String> savedTracks = new ArrayList<String>(musicReccomendationList.getItems());

        FileWriter fileWriter = new FileWriter("saved_data.txt", false);

        for(String savedItems : savedTracks){
            fileWriter.write(savedItems + "\n");
        }

        fileWriter.close();
    }

    /**
     * Loads recent work in recommendation list
     * @param actionEvent
     */
    public void loadRecent(ActionEvent actionEvent) throws IOException {
        this.clearList();

        List<String> readTracks = new ArrayList<String>();

        String filePath = "saved_data.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

        String currentLine;
        while((currentLine = bufferedReader.readLine()) != null)
        {
            musicReccomendationList.getItems().add(currentLine);

        }
    }
}
