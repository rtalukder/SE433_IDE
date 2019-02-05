package edu.depaul.se433.hw4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Class: SE433 - Homework4
 * Author: Raquib Talukder
 */

@RunWith(Parameterized.class)
public class LengthConverterParameterizedTests_ExceptionsThrown {
    private final static String NegativeException = "Negative numbers not allowed";

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                // expected, input value
                { NegativeException,  -10 },
                { NegativeException,  -100.0 },
                { NegativeException,  -0.00000000000000000000000000001 },
                { NegativeException,  -999999999.0 },
                { NegativeException,  -10000000000000000000.0 },
        });
    }

    private String expected; // expected output
    private double value;     // input value

    public LengthConverterParameterizedTests_ExceptionsThrown(String expected, double value) {
        this.expected = expected;
        this.value = value;
    }

    @Test
    public void fails_negative_double_lengthconverter_km_to_mile(){
        // Act
        try{
            new LengthConverter().kmToMile(value);
            fail("Should not be able to get here");

        } catch (IllegalArgumentException error){
            // Assert
            assertEquals(expected, error.getMessage());
        }
    }

    @Test
    public void fails_negative_double_lengthconverter_mile_to_km(){
        // Act
        try{
            new LengthConverter().kmToMile(value);
            fail("Should not be able to get here");

        } catch (IllegalArgumentException error){
            // Assert
            assertEquals(expected, error.getMessage());
        }
    }
}
