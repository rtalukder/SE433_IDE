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
public class LengthConverterParameterizedTests {
    private final double delta = .0001;

    @Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][] {
                // expected, input value
                {    1,      0 },
                {    1,      1 },
                {    2,      2 },
                {   24,      4 },
                { 5040,      7 },
        });
    }

    private long expected; // expected output
    private int value;     // input value

    public LengthConverterParameterizedTests(long expected, int value) {
        this.expected = expected;
        this.value = value;
    }

    @Test
    public void successful_lengthconverter_km_to_mile(){
        LengthConverter converter = new LengthConverter();
        assertEquals(expected, converter.kmToMile(value), delta);
    }

}
