package com.example.linseb325.travelingsalesman;

import java.util.LinkedList;

/**
 * Created by linseb325 on 5/2/16.
 */
public class CityGraph
{
    private LinkedList<City> cities;
    private LinkedList<Edge> edges;

    public CityGraph()
    {
        this.cities = new LinkedList<City>();
        this.edges = new LinkedList<Edge>();
    }

    public void connectCitiesWithNames(String cityA, String cityB, int distance)
    {
        if(this.getCityWithName(cityA) != null && this.getCityWithName(cityB) != null)
        {
            City firstCity = this.getCityWithName(cityA);
            City secondCity = this.getCityWithName(cityB);
            Edge newEdge = new Edge(distance, firstCity, secondCity);
            firstCity.getEdges().addLast(newEdge);
            secondCity.getEdges().addLast(newEdge);
            this.edges.addLast(newEdge);
        }
        else System.out.println("Unable to connect those two cities! One or both don't exist!");
    }

    public void addCityWithName(String newCityName)
    {
        this.cities.addLast(new City(newCityName));
    }

    public City getCityWithName(String cityToSearch)
    {
        for (City c: this.cities)
        {
            if(c.getName().equals(cityToSearch))
            {
                return c;
            }
        }
        return null;
    }

    public void displayCitiesToConsole()
    {
        for (City c: this.cities)
        {
            System.out.println(c.display());
        }
    }
}
