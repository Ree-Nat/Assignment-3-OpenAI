package org.example.demo.Model;
import org.apache.hc.core5.http.ParseException;
import org.example.demo.Model.Track;

import java.io.IOException;
import java.util.List;

/**
 * Main recommendation engine that uses different strategies
 * Demonstrates Composition and Strategy Pattern
 */
public class RecommendationEngine {
    private RecommendationStrategy strategy;

    /**
     * Creates the recommendation engine strategy object
     * @param strategy  a strategy type object that implements the strategy interface
     */
    public RecommendationEngine(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Sets the current strategy of the recomendation engine
     * @param strategy a strategy type object that implements the strategy interface
     */
    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Gets the reccomendation of songs called in by the spotify API
     * @param query a string representing track id, artist name, album name
     * @param count the amount of tracks to be retrieved via spotify API
     * @return
     * @throws IOException if API cannot be called
     * @throws ParseException if parsing a null object from a failed api call.
     */
    public List<Track> getRecommendations(String query, int count) throws IOException, ParseException {
        System.out.println("Using strategy: " + strategy.getStrategyName());
        return strategy.recommend(query, count);
    }
}
