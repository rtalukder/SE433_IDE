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
public class OrdersTestStrongNormal{
    private final double delta = .001;

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws IllegalArgumentException {
        return Arrays.asList(new Object[][] {
                // expected, raw total, shipping method, destination state
                { 40.00,  30,  ShippingMethod.Standard, "Iowa"},           // pass
                { 60.00,  35,  ShippingMethod.NextDay, "Wisconsin"},       // pass
                { 60.00,  60,  ShippingMethod.Standard, "Michigan"},       // pass - customer chooses free standard
                { 90.00,  65,  ShippingMethod.NextDay, "Pennsylvania"},    // pass - customer choose next-day instead
                { 53.60,  40,  ShippingMethod.Standard, "IL"},             // would use 'Illinois' but program has a bug
                { 74.05,  45,  ShippingMethod.NextDay, "California"},      // pass
                { 69.95,  55,  ShippingMethod.Standard, "New York"},       // pass
                { 134.00, 100, ShippingMethod.NextDay, "Illinois"},              // would use 'Illinois' but program has a bug
        });
    }


    private double expected;                        // expected output
    private double rawTotal;                           // input value
    private Orders.ShippingMethod shippingMethod;   // input value
    private String destinationState;                // input value

    public OrdersTestStrongNormal(double expected, double rawTotal, Orders.ShippingMethod shippingMethod, String destinationState) {
        this.expected = expected;
        this.rawTotal = rawTotal;
        this.shippingMethod = shippingMethod;
        this.destinationState = destinationState;
    }

    @Test
    public void Calculate_Total_Strong_Normal(){
        assertEquals(expected, Orders.calculateTotal(rawTotal, shippingMethod, destinationState), delta);
    }
}
