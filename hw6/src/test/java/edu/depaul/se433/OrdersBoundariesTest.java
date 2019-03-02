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
public class OrdersBoundariesTest {
    private final double delta = .00001;

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws IllegalArgumentException {
        return Arrays.asList(new Object[][] {
                // expected, raw total, shipping method, destination state
                { 10.01,   0.01,  ShippingMethod.Standard, "Iowa"},
                { 25.01,    .01,  ShippingMethod.NextDay, "Wisconsin"},
                { 59.99,  49.99,  ShippingMethod.Standard, "Michigan"},
                { 60.00,  50.00,  ShippingMethod.Standard, "Pennsylvania"},
                { 50.01,  50.01,  ShippingMethod.Standard, "Arizona"},
                { 10.11,   0.01,  ShippingMethod.Standard, "IL"},
                { 25.00,    .01,  ShippingMethod.NextDay, "New York"},
                { 64.49,  49.99,  ShippingMethod.Standard, "California"},
                { 64.50,  50.00,  ShippingMethod.Standard, "IL"},
                { 54.50,  50.01,  ShippingMethod.Standard, "New York"},
        });
    }


    private double expected;                        // expected output
    private double rawTotal;                           // input value
    private Orders.ShippingMethod shippingMethod;   // input value
    private String destinationState;                // input value

    public OrdersBoundariesTest(double expected, double rawTotal, Orders.ShippingMethod shippingMethod, String destinationState) {
        this.expected = expected;
        this.rawTotal = rawTotal;
        this.shippingMethod = shippingMethod;
        this.destinationState = destinationState;
    }

    @Test
    public void Calculate_Total_Boundaries(){
        assertEquals(expected, Orders.calculateTotal(rawTotal, shippingMethod, destinationState), delta);
    }
}
