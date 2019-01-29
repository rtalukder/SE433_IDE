package org.depaul.edu.se433;
/*
   Class: SE433 - Homework3
   Author: Raquib Talukder
*/

public class LengthConverter {
    private double length;
    private final double kmToMileConversion = 0.621371192;
    private final double mileToKmConversion = 1.609344000;


    public double kmToMile(double km) throws IllegalArgumentException{
        if (km <0) throw new IllegalArgumentException("Negative numbers not allowed");
        else return km*kmToMileConversion;
    }

    public double mileToKm(double mile)throws IllegalArgumentException{
        if (mile <0) throw new IllegalArgumentException("Negative numbers not allowed");
        else return mile*mileToKmConversion;
    }
}
