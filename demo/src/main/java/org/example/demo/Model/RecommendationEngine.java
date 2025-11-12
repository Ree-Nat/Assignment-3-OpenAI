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

    public RecommendationEngine(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RecommendationStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Track> getRecommendations(String query, int count) throws IOException, ParseException {
        System.out.println("Using strategy: " + strategy.getStrategyName());
        return strategy.recommend(query, count);
    }
}
