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
                { "Cat",        "Cats" },
                { "Bus",        "Busses" },
                { "Fez",        "Fezzes" },
                { "Wife",       "Wives" },
                { "Puppy",      "Puppies" },
                { "Potato",     "Potatoes" },
                { "Focus",      "Foci" },
                { "Ellipsis",   "Ellipses" },
                { "Criterion",  "Criteria" },
                { "Opera",      "Opus" },           // boundary
                { "Lasagna",    "Lasagne" },        // boundary
                { "Prius",      "Prii" },           // boundary
                { "Spaghetto",  "Spaghetti" },      // boundary

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
