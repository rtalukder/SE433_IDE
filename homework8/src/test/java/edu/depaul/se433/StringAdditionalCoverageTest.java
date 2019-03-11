package edu.depaul.se433;

/**
 * Class: SE433 - Homework8
 * Author: Raquib Talukder
 **/

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringAdditionalCoverageTest{

    @Test
    public void Pluralize_Additional_Coverage_Test_Exception(){
        try{
            StringUtil.pluralize("he!!0");
            fail("Shouldn't be able to get here.");
        }
        catch (IllegalArgumentException error){
            assertNull(error.getMessage());
        }
    }

    @Test
    public void Pluralize_Additional_Coverage_Test_Null_Value(){
        assertNull(StringUtil.pluralize(null));
    }

    @Test
    public void Pluralize_Additional_Coverage_Uncountable_String(){
        assertEquals("information", StringUtil.pluralize("information"));
    }

    @Test
    public void Pluralize_Additional_Coverage_Irregular_String(){
        assertEquals("children", StringUtil.pluralize("child"));
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new String[][] {
                // expected, input value
                { "yesterdays",   "yesterday" },
                { "trolleys",  "trolley" },
                // { "",    "Fez" },           // none with -iy ending
                { "decoys",    "decoy" },
                { "buys",      "buy" },
        });
    }

    private String expected;
    private String input;

    public StringAdditionalCoverageTest(String expected, String input){
        this.expected = expected;
        this.input = input;
    }

    @Test
    public void Pluralize_Additional_Coverage_y_to_ies(){
        assertEquals(expected, StringUtil.pluralize(input));
    }

}
