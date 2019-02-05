package edu.depaul.se433.hw4;

/**
 * Class: SE433 - Homework4
 * Author: Raquib Talukder
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LengthConverterParameterizedTests_kmToMi {
    private final double delta = .0001;
    private final static double kmToMileConversion = 0.621371192;

    @Parameters
    public static Collection<Double[]> data() {
        return Arrays.asList(new Double[][] {
                // expected, input value
                {    0.0*kmToMileConversion,      0.0 },
                {   10.0*kmToMileConversion,     10.0 },
                {  500.0*kmToMileConversion,    500.0 },
                { 2000.0*kmToMileConversion,   2000.0 },
                { 5000.0*kmToMileConversion,  10000.0 },
        });
    }

    private double expected; // expected output
    private double value;     // input value

    public LengthConverterParameterizedTests_kmToMi(double expected, double value) {
        this.expected = expected;
        this.value = value;
    }

    @Test
    public void successful_lengthconverter_km_to_mile(){
        LengthConverter converter = new LengthConverter();
        assertEquals(expected, converter.kmToMile(value), delta);
    }

}
