package com.example.linseb325.travelingsalesman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CityGraph theGraph = new CityGraph();
        theGraph.addCityWithName("Scranton");
        theGraph.addCityWithName("Mequon");
        theGraph.addCityWithName("Las Vegas");
        theGraph.addCityWithName("Mexico City");
        theGraph.connectCitiesWithNames("Scranton", "Mequon", 9);
        theGraph.connectCitiesWithNames("Scranton", "Mexico City", 22);
        theGraph.connectCitiesWithNames("Mequon", "Las Vegas", 13);
        theGraph.connectCitiesWithNames("Mexico City", "Mequon", 11);
        theGraph.displayCitiesToConsole();


    }
}
