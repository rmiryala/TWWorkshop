package com.twair;

import java.util.HashMap;

public class Plane {
    private String type;
    private Integer numberOfSeats;
    private HashMap<TravelType,Integer> noOfSeats;



    public Plane(String type, Integer numberOfSeats) {
        this.type = type;
        this.numberOfSeats = numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public Integer getNumberOfSeats() {
        return numberOfSeats;
    }



}
