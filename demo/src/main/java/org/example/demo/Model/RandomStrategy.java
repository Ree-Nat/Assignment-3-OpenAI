package org.example.demo.Model;

import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.util.List;
import java.util.Random;


/**
 * Type of strategy that handles getting random artist from API
 */
public class RandomStrategy implements RecommendationStrategy{
    /**
     * Reccomends random tracks via spotify API
     * @param query a string representing track id, artist name, album name
     * @param count the amount of tracks to be retrieved via spotify API
     * @return a List of tracks
     * @throws IOException if API cannot be called
     * @throws ParseException if parsing a null object from a failed api call.
     */
    @Override
    public List<Track> recommend(String query, int count) throws IOException, ParseException {
         //get random string of letters
        Random rand = new Random();
        int min = 65; // Inclusive lower bound
        int max = 122; // Inclusive upper bound

        // To get a random integer between min (inclusive) and max (inclusive):


        String randomString = "";
        for(int x = 0; x < 10; x++)
        {
            char randomLetter = (char) (rand.nextInt((max - min) + 1) + min);
            randomString += randomLetter;
        }


        SpotifyAPIClient apiClient = new SpotifyAPIClient();
        //serach for one single song
        apiClient.authenticate();
        return apiClient.searchTracks(randomString, 1);
    }

    @Override
    public String getStrategyName() {
        return "";
    }
}

