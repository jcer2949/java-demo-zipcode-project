package com.kenzie.app.zipcode;

public class Address {

    //declare properties
    private String name;
    private String street;
    private String city;
    private String state; //enum for State
    private String zipCode;
    //declare constructors
public Address(){
    this("", "", "", "");
}
public Address (String city, String state){
    this.city=city;
    this.state= state;
}
    public Address(String name, String street, String city, String state){
    this.name= name;
    this.street= street;
    this.city= city;
    this.state= state;
}
    //declare methods
    //getters/setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}
