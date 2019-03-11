package edu.depaul.se433;

/**
 * Class: SE433 - Homework8
 * Author: Raquib Talukder
 **/

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import static edu.depaul.se433.Orders.ShippingMethod;

@RunWith(Parameterized.class)
public class OrdersAdditionalCoverageTest {
    private final double delta = .00001;

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws IllegalArgumentException {
        return Arrays.asList(new Object[][]{
                // expected, raw total, shipping method, destination state
                {69.95,  55,  ShippingMethod.Standard, "NY"},
                {74.05,  45,  ShippingMethod.NextDay, "CA"},
                {53.60,  40,  ShippingMethod.Standard, "Illinois"},
        });
    }

    private double expected;                        // expected output
    private double rawTotal;                        // input value
    private Orders.ShippingMethod shippingMethod;   // input value
    private String destinationState;                // input value

    public OrdersAdditionalCoverageTest(double expected, double rawTotal, Orders.ShippingMethod shippingMethod, String destinationState) {
        this.expected = expected;
        this.rawTotal = rawTotal;
        this.shippingMethod = shippingMethod;
        this.destinationState = destinationState;
    }

    @Test
    public void Calculate_Total_Additional_Coverage_Test(){
        assertEquals(expected, Orders.calculateTotal(rawTotal, shippingMethod, destinationState), delta);
    }
}
