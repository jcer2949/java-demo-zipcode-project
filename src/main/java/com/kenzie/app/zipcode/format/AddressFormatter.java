package com.kenzie.app.zipcode.format;
//utility class -class that has static helper methods
//example: Math class: Math.min() or Math.random()

import java.util.HashMap;

public class AddressFormatter {
    //declare properties
    //lookup table - HashMap
    private static HashMap<String, String> abbreviationTable;

    //initialize map -- hardCode here
    public static void initializeAddressMap(){
        abbreviationTable= new HashMap<>();
        abbreviationTable.put("ST", "STREET");
        abbreviationTable.put("ST.", "STREET");
        abbreviationTable.put("St", "STREET");
        abbreviationTable.put("St.", "STREET");
        abbreviationTable.put("st", "STREET");
        //avenue
        abbreviationTable.put("AVE", "AVENUE");
        abbreviationTable.put("AVE.", "AVENUE");
        abbreviationTable.put("Ave.", "AVENUE");
        abbreviationTable.put("Ave", "AVENUE");
        //blvd
        abbreviationTable.put("BLVD", "BOULEVARD");
        abbreviationTable.put("BLVD.", "BOULEVARD");
        abbreviationTable.put("Blvd", "BOULEVARD");
        abbreviationTable.put("Blvd.", "BOULEVARD");
        //road
        abbreviationTable.put("RD", "ROAD");
        abbreviationTable.put("RD.", "ROAD");
        abbreviationTable.put("Rd", "ROAD");
        abbreviationTable.put("Rd.", "ROAD");


    }

    //replace address string - use the map
    //example input: 123 Main St.
    //output: 123 Main STREET
    public static String replaceAbbrevation(String input){
        String resultStr;
        //write replace logic

    }
}
