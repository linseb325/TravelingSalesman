package com.example.linseb325.travelingsalesman;

/**
 * Created by linseb325 on 5/2/16.
 */
public class Edge
{
    private int distance;
    private City cityA;
    private City cityB;

    public Edge(int distance, City cityA, City cityB)
    {
        this.distance = distance;
        this.cityA = cityA;
        this.cityB = cityB;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public City getCityA() {
        return cityA;
    }

    public void setCityA(City cityA) {
        this.cityA = cityA;
    }

    public City getCityB() {
        return cityB;
    }

    public void setCityB(City cityB) {
        this.cityB = cityB;
    }
}
