package edu.depaul.se433.inClassWeek3;

/**
 * All errors from the CalculationServer result in this
 * exception being thrown.
 */

public class CalculationException extends RuntimeException {
    public CalculationException(String msg) {
        super(msg);
    }
}
