package edu.depaul.se433;

/**
 * Class: SE433 - Homework 6 - part 2
 * Author: Raquib Talukder
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilRobustnessTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new String[][] {
                // expected, input value
                { "", "Autobús" },
                { "", "বাস" },
        });
    }

    private String expected;
    private String input;

    public StringUtilRobustnessTest(String expected, String input){
        this.expected = expected;
        this.input = input;
    }

    @Test
    public void Pluralize_Robustness() throws IllegalArgumentException {
        try{
            StringUtil.pluralize(input);
            fail("Shouldn't get here");
        }
        catch (IllegalArgumentException error){
            assertEquals("", error.getMessage());
        }
    }
}
