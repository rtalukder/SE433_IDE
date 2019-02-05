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
public class LengthConverterParameterizedTests_miToKm {
    private final double delta = .0001;
    private final static double mileToKmConversion = 1.609344000;

    @Parameters
    public static Collection<Double[]> data() {
        return Arrays.asList(new Double[][] {
                // expected, input value
                {     0.0*mileToKmConversion,      0.0 },
                {    10.0*mileToKmConversion,     10.0 },
                {   500.0*mileToKmConversion,    500.0 },
                {  2000.0*mileToKmConversion,   2000.0 },
                { 10000.0*mileToKmConversion,  10000.0 },
        });
    }

    private double expected; // expected output
    private double value;     // input value

    public LengthConverterParameterizedTests_miToKm(double expected, double value) {
        this.expected = expected;
        this.value = value;
    }

    @Test
    public void successful_lengthconverter_mile_to_km(){
        LengthConverter converter = new LengthConverter();
        assertEquals(expected, converter.mileToKm(value), delta);
    }

}
