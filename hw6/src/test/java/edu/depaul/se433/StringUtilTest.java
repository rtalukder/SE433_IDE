package edu.depaul.se433;

/**
 * Class: SE433 - Homework 6 - part 2
 * Author: Raquib Talukder
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class StringUtilTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new String[][] {
                // expected, input value
                { "Cats",      "Cat" },
                { "Bus",       "Bus" },
                { "Fezzez",    "Fez" },
                { "Wives",     "Wife" },
                { "Puppies",   "Puppy" },
                { "Potatoes",  "Potato" },
                { "Foci",      "Focus" },
                { "Ellipses",  "Ellipse" },
                { "Criteria",  "Criterion" },
                { "Opus",      "Opera" },           // boundary
                { "Lasagne",   "Lasagna" },        // boundary
                { "Prii",      "Prius" },           // boundary
                { "Spaghetti", "Spaghetto" },      // boundary

        });
    }

    private String expected;
    private String input;

    public StringUtilTest(String expected, String input){
        this.expected = expected;
        this.input = input;
    }

    @Test
    public void Pluralize_Strong_Normal(){
        assertEquals(expected, StringUtil.pluralize(input));
    }
}
