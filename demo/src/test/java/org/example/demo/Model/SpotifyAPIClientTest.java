package org.example.demo.Model;

import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class SpotifyAPIClientTest {

    @Test
    void authenticate() throws IOException, ParseException {
        SpotifyAPIClient apiClient = new SpotifyAPIClient();
        apiClient.authenticate();

    }

    @Test
    void searchTracks() throws IOException, ParseException {
        SpotifyAPIClient apiClient = new SpotifyAPIClient();
        apiClient.authenticate();
        System.out.println(apiClient.searchTracks("lady gaga", 1));
    }

    @Test
    void getRecommendations() throws IOException, ParseException {
        SpotifyAPIClient apiClient = new SpotifyAPIClient();
        apiClient.authenticate();
        List<String> listStringId = new ArrayList<>();
        listStringId.add("1254531");
        System.out.println(apiClient.getRecommendations(listStringId, 1));
    }
    @Test
    void getAudioFeatures() throws IOException, ParseException {
        SpotifyAPIClient apiClient = new SpotifyAPIClient();
        apiClient.authenticate();

        List<Track> songList = apiClient.searchTracks("lady gaga", 1);
        String badRomance_Id = songList.getFirst().getId();

        System.out.println(badRomance_Id);

        AudioFeatures songFeatures = apiClient.getAudioFeatures(badRomance_Id);

    }

    @Test
    void close() {
    }
}