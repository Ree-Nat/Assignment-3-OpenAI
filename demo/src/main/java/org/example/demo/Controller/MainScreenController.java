package org.example.demo.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.apache.hc.core5.http.ParseException;
import org.example.demo.Model.RandomStrategy;
import org.example.demo.Model.RecommendationEngine;
import org.example.demo.Model.SearchStrategy;
import org.example.demo.Model.Track;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.List;

public class MainScreenController {

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
}
