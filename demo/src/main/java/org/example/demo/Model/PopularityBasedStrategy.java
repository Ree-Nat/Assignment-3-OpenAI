package org.example.demo.Model;

import org.apache.hc.core5.http.ParseException;
import org.example.demo.Model.Track;
import org.example.demo.Model.SpotifyAPIClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Recommends tracks based on popularity
 * Demonstrates Polymorphism - implements RecommendationStrategy
 */

//Does not work as of right now

    /**
public class PopularityBasedStrategy implements RecommendationStrategy {
    private final SpotifyAPIClient apiClient;

    public PopularityBasedStrategy(SpotifyAPIClient apiClient) {
        this.apiClient = apiClient;
    }


    @Override
    public List<Track> recommend(List<Track> userTracks, int count) {
        try {
            // Use first track as seed
            if (userTracks.isEmpty()) {
                return new ArrayList<>();
            }

            List<String> seedIds = new ArrayList<>();
            seedIds.add(userTracks.get(0).getId());

            return apiClient.getRecommendations(seedIds, count);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String getStrategyName() {
        return "Popularity-Based Recommendations";
    }
}

**/
