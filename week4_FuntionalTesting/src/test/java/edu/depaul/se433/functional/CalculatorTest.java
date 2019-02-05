package edu.depaul.se433.functional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

/**
 * Demonstrate the use of parameterized tests
 *
 */
@RunWith(Parameterized.class)
public class CalculatorTest {

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

    public CalculatorTest(long expected, int value) {
        this.expected = expected;
        this.value = value;
    }

    @Test
    public void verify_factorial_result_matches_manual_calculation() {
        Calculator calc = new Calculator();
        assertEquals(expected, calc.factorial(value));
    }


}
