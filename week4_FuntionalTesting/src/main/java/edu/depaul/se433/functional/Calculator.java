package edu.depaul.se433.functional;

/**
 * Simple classs to demonstrate parameterized tests.
 * @see CalculatorTest
 */
public class Calculator {

    public long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
