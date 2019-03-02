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

import static edu.depaul.se433.Orders.ShippingMethod;

@RunWith(Parameterized.class)
public class OrdersTestRobustness {
    private final double delta = .00001;

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws IllegalArgumentException {
        return Arrays.asList(new Object[][] {
                // raw total, shipping method, destination state
                { 100, ShippingMethod.Standard, "Puerto Rico"},
                { 100, ShippingMethod.NextDay, "Australia"},
                { 100, ShippingMethod.Standard, "New Zealand"},
                { 100, ShippingMethod.NextDay, "Mexico"},
                { -10, ShippingMethod.Standard, "Arizona"},
                { -10, ShippingMethod.NextDay, "Arizona"},
                { -10, ShippingMethod.Standard, "IL"},
                { -10, ShippingMethod.NextDay, "California"},
        });
    }

    private double rawTotal;                        // input value
    private Orders.ShippingMethod shippingMethod;   // input value
    private String destinationState;                // input value

    public OrdersTestRobustness(double rawTotal, Orders.ShippingMethod shippingMethod, String destinationState) {
        this.rawTotal = rawTotal;
        this.shippingMethod = shippingMethod;
        this.destinationState = destinationState;
    }

    @Test
    public void Calculate_Total_Robustness() throws IllegalArgumentException{
        try{
            Orders.calculateTotal(rawTotal, shippingMethod, destinationState);
            fail("Shouldn't be able to get here");
        }
        catch (IllegalArgumentException error){
            assertEquals("Total must be positive.", error.getMessage());
        }
    }
}
