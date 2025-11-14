package org.example.demo.Model;

import java.util.List;

/**
 * Represents a music track with encapsulated properties.
 * Demonstrates Encapsulation - private fields with public getters/setters
 */
public class Track {
    private String id;
    private String name;
    private List<String> artists;
    private String albumName;
    private int durationMs;
    private int popularity;
    private String previewUrl;

    /**
     * Constructs the track object
     * @param id String
     * @param name String
     * @param artists list of Strings
     * @param albumName String album name
     */
    public Track(String id, String name, List<String> artists, String albumName) {
        this.id = id;
        this.name = name;
        this.artists = artists;
        this.albumName = albumName;
    }

    /**
     * returns ID of track
      * @return string ID
     */
    public String getId() {
        return id;
    }

    /**
     * Sets ID of track
     * @param id String id of track name
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *  Gets name of track
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name of track
     * @param name String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the artist of track
     * @return list of artist names
     */
    public List<String> getArtists() {
        return artists;
    }

    /**
     * Sets the artist name of track
     * @param artists name of artists
     */
    public void setArtists(List<String> artists) {
        this.artists = artists;
    }

    /**
     * gets the artist name
     * @return the name of album
     */
    public String getAlbumName() {
        return albumName;
    }

    /**
     * Sets album name
     * @param albumName the name of the album
     */
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    /**
     * Gets the duration of the track in milliseconds
     * @return the integer length of the track
     */
    public int getDurationMs() {
        return durationMs;
    }

    /**
     * Sets the duration of the track
     * @param durationMs an integer of the track length
     */
    public void setDurationMs(int durationMs) {
        this.durationMs = durationMs;
    }

    /**
     * Gets the popularity of the track
     * @return the track popularity
     */
    public int getPopularity() {
        return popularity;
    }

    /**
     * Sets the popularity of the track
     * @param popularity an integer representing the popularity
     */
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    /**
     * Gets the preview URL for the track
     * @return the preview URL
     */
    public String getPreviewUrl() {
        return previewUrl;
    }

    /**
     * Sets the preview URl
     * @param previewUrl sets the preview URL of the track
     */
    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    /**
     * Prints out the track's content for debugging
     * @return a string with the artists, the name, and the album name
     */
    @Override
    public String toString() {
        return String.format("%s - %s (%s)", String.join(", ", artists), name, albumName);
    }

    /**
     * Formats the duration of the track for readability
     * @return a String that shows the album's minutes and seconds
     */
    // Convert duration to readable format
    public String getFormattedDuration() {
        int seconds = durationMs / 1000;
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }
}
