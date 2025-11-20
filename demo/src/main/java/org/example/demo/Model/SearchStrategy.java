package org.example.demo.Model;

import org.apache.hc.core5.http.ParseException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A class that recommends artist based on searching the name
 */
public class SearchStrategy implements  RecommendationStrategy{

    @Override
    public List<Track> recommend(String query, int count) throws IOException, ParseException {
        SpotifyAPIClient api = new SpotifyAPIClient();
        api.authenticate();

        // Get artist ID
        String artistId = api.searchArtistId(query);
        if (artistId == null) {
            return List.of();
        }

        // Get top 20 tracks
        List<Track> topTracks = api.getArtistTopTracks(artistId);
        if (topTracks.isEmpty()) {
            return List.of();
        }

        // Step 3 — Choose a random one
        Random rand = new Random();
        Track randomTrack = topTracks.get(rand.nextInt(topTracks.size()));

        return List.of(randomTrack);
    }


    @Override
    public String getStrategyName() {
        return "Search Based Recommendation";
    }
}
