package org.example.demo.Model;

import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A class that recommends artist based on searching the name
 */
public class SearchStrategy implements  RecommendationStrategy{

    SpotifyAPIClient spotifyAPIClient = new SpotifyAPIClient();
    @Override
    public List<Track> recommend(String query, int count) throws IOException, ParseException {
        spotifyAPIClient.authenticate();
        return spotifyAPIClient.searchTracks(query, count);
    }

    /**
     * Gets the name of the strategy
     * @return a string
     */
    @Override
    public String getStrategyName() {
        return "Search Based Recommendation";
    }
}
