package org.example.demo.Model;


/**
 * Configures the client id and key from spotify API
 */
public class Config {
    // Replace with your Spotify credentials
    public static final String CLIENT_ID = "67d71750f5094c48980770ba4ae4b946";
    public static final String CLIENT_SECRET = "d84b72e7d2d546f5924e35d304c21582";

    // API Endpoints
    public static final String TOKEN_URL = "https://accounts.spotify.com/api/token";
    public static final String API_BASE_URL = "https://api.spotify.com/v1";

    // Server Configuration
    public static final int SERVER_PORT = 8888;
    public static final String SERVER_HOST = "127.0.0.1";

}
