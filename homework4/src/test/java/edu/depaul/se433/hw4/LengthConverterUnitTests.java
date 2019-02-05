package edu.depaul.se433.hw4;

/*
   Class: SE433 - Homework4
   Author: Raquib Talukder
*/

import static org.junit.Assert.*;
import org.junit.Test;

public class LengthConverterUnitTests {
    private final double delta = .0001;

    @Test
    public void successful_lengthconverter_km_to_mile(){
        // Arrange
        double km = 2;

        // Act
        double kmToMilesExpected = 1.24274;
        double kmToMilesActual = new LengthConverter().kmToMile(km);

        // Assert
        assertEquals(kmToMilesExpected, kmToMilesActual, delta);
    }

    @Test
    public void successful_lengthconverter_mile_to_km(){
        // Arrange
        double miles = 2;

        // Act
        double milesToKmExpected = 3.21869;
        double milesToKmActual = new LengthConverter().mileToKm(miles);

        // Assert
        assertEquals(milesToKmExpected, milesToKmActual, delta);
    }

    @Test
    public void fails_negative_double_lengthconverter_km_to_mile(){
        // Arrange
        double km = -10;

        // Act
        try{
            new LengthConverter().kmToMile(km);
            fail("Should not be able to get here");

        } catch (IllegalArgumentException error){
            // Assert
            assertEquals("Negative numbers not allowed", error.getMessage());
        }
    }

    @Test
    public void fails_negative_double_lengthconverter_mile_to_km(){
        // Arrange
        double miles = -10;

        // Act
        try{
            new LengthConverter().kmToMile(miles);
            fail("Should not be able to get here");

        } catch (IllegalArgumentException error){
            // Assert
            assertEquals("Negative numbers not allowed", error.getMessage());
        }
    }
}
