package com.eniac.interviews.airportbaggagerouting;

import com.eniac.interviews.airportbaggagerouting.model.DirectedEdge;

import java.util.List;

/**
 * 
 * @author VenuKotu
 *
 */
public interface DijkstraAlgorithm {
    public String findShortestPath(String entry,String dest, List<DirectedEdge> graphEdges);
}
