package com.eniac.interviews.airportbaggagerouting;

/**
 * 
 * @author VenuKotu
 *
 */
public class DijkstraAlgorithmFactory {

    public static DijkstraAlgorithm createDijkstraAlgorithm(){
        return new DijkstraAlgorithmImpl();
    }
}
