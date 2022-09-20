package com.kenzie.app.zipcode.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.util.List;

public class ZipCodeDTO {
    //declare properties
    @JsonProperty(value= "place name")
    private String place_name;
    @JsonProperty(value = "post code")
    private List<Place> places;
    private String state;

    //declare methods - getters/setters
    public List<Place> getPlaces(){
        return places;
    }

    public void setPlaces(List<Place> places){
        this.places=places;
    }
}
