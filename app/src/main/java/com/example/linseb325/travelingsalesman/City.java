package com.example.linseb325.travelingsalesman;

import java.util.LinkedList;

/**
 * Created by linseb325 on 5/2/16.
 */
public class City
{
    private String name;
    private LinkedList<Edge> edges;

    public City(String name)
    {
        this.name = name;
        this.edges = new LinkedList<Edge>();
    }

    public String display()
    {
        String toDisplay = this.name + "; Connected to cities: ";
        for (Edge e: this.edges)
        {
            if(e.getCityA().equals(this))
            {
                toDisplay += e.getCityB().name + "-" + e.getDistance() + " ";
            }
            else if(e.getCityB().equals(this))
            {
                toDisplay += e.getCityA().name + "-" + e.getDistance() + " ";
            }
        }
        return toDisplay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Edge> getEdges() {
        return edges;
    }
}
