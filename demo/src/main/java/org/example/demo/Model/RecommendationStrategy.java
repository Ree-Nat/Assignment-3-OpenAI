package org.example.demo.Model;
import org.apache.hc.core5.http.ParseException;
import org.example.demo.Model.Track;

import java.io.IOException;
import java.util.List;

/**
 * Strategy interface for different recommendation algorithms
 * Demonstrates Abstraction and Strategy Pattern
 */
public interface RecommendationStrategy {
    List<Track> recommend(String query, int count) throws IOException, ParseException;
    String getStrategyName();
}