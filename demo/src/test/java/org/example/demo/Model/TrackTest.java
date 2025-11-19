package org.example.demo.Model;

import org.apache.hc.core5.http.ParseException;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
A test to check of parsing works
 */
class TrackTest {


    public Track trackVariableTest = this.getTrack("lady gaga");

    TrackTest() throws IOException, ParseException {
    }

    private Track getTrack(String query) throws IOException, ParseException {
        SpotifyAPIClient apiClient = new SpotifyAPIClient();
        apiClient.authenticate();
        return apiClient.searchTracks(query, 1).getFirst();
    }

    @Test
    void getId() {
        System.out.println(trackVariableTest.getId());
    }

    @Test
    void setId() {
        System.out.println(trackVariableTest.getId());
    }

    @Test
    void getName() {
        System.out.println(trackVariableTest.getName());
    }

    @Test
    void setName() {
        System.out.println(trackVariableTest.getName());
    }

    @Test
    void getArtists() {
        System.out.println(trackVariableTest.getArtists());
    }

    @Test
    void setArtists() {
        System.out.println(trackVariableTest.getArtists());
    }

    @Test
    void getAlbumName() {
        System.out.println(trackVariableTest.getAlbumName());
    }

    @Test
    void setAlbumName() {
        System.out.println(trackVariableTest.getAlbumName());
    }

    @Test
    void getDurationMs() {
        System.out.println(trackVariableTest.getDurationMs());
    }

    @Test
    void setDurationMs() {
        trackVariableTest.setDurationMs(1000);
        System.out.println(trackVariableTest.getDurationMs());
    }

    @Test
    void getPopularity() {
        System.out.println(trackVariableTest.getPopularity());
    }

    @Test
    void setPopularity() {
        trackVariableTest.setPopularity(10);
        System.out.println(trackVariableTest.getPopularity());
    }

    @Test
    void getPreviewUrl() {
        System.out.println(trackVariableTest.getPreviewUrl());
    }

    @Test
    void setPreviewUrl() {
        trackVariableTest.setPreviewUrl("https://www.google.com");
        System.out.println(trackVariableTest.getPreviewUrl());
    }

    @Test
    void testToString() {
        System.out.println(trackVariableTest.toString());
    }

    @Test
    void getFormattedDuration() {
        System.out.println(trackVariableTest.getFormattedDuration());
    }
}