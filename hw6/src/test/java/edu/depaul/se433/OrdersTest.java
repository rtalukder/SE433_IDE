package edu.depaul.se433;

/**
 * Class: SE433 - Homework 6 - part 2
 * Author: Raquib Talukder
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static edu.depaul.se433.Orders.ShippingMethod;

@RunWith(Parameterized.class)
public class OrdersTest{

    @Parameterized.Parameters
    public static Collection<Object[]> data() throws IllegalArgumentException {
        return Arrays.asList(new Object[][] {
                // expected, input value
                { null , 30,  ShippingMethod.Standard, "Iowa"},           // pass
                { null, 35,  ShippingMethod.NextDay, "Wisconsin"},       // pass
                { null, 60,  ShippingMethod.Standard, "Michigan"},       // pass
                { null, 65,  ShippingMethod.NextDay, "Pennsylvania"},    // pass
                { null, 40,  ShippingMethod.Standard, "IL"},             // would use 'Illinois' but program has a bug - this is part of strong normal
                { null, 45,  ShippingMethod.NextDay, "California"},      // pass
                { null, 55,  ShippingMethod.Standard, "New York"},       // pass
                { null, 100, ShippingMethod.NextDay, "IL"},              // would use 'Illinois' but program has a bug - this is part of strong normal
                { new IllegalAccessException(), 30,  ShippingMethod.valueOf("Ground"), "IL"},    // error - ground shipping
                { new IllegalAccessException(), 55,  ShippingMethod.valueOf("Ground"), "IL"},    // error - ground shipping
                { new IllegalAccessException(), 40,  ShippingMethod.valueOf("Ground"), "IL"},    // error - ground shipping
                { new IllegalAccessException(), 100, ShippingMethod.NextDay, "IL"},
                { new IllegalAccessException(), 100, ShippingMethod.NextDay, "IL"},
                { new IllegalAccessException(), 100, ShippingMethod.NextDay, "IL"},
                { new IllegalAccessException(), 100, ShippingMethod.NextDay, "IL"},
                { new IllegalAccessException(), -10, ShippingMethod.Standard, "Arizona"},
                { new IllegalAccessException(), -10, ShippingMethod.NextDay, "Arizona"},
                { new IllegalAccessException(), -10, ShippingMethod.Standard, "IL"},
                { new IllegalAccessException(), -10, ShippingMethod.NextDay, "California"},
        });
    }


    private double expected; // expected output
    private double value;     // input value

    public OrdersTest(double expected, double value) {
        this.expected = expected;
        this.value = value;
    }
}
