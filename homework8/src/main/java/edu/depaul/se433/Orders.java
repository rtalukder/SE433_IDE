package edu.depaul.se433;

/**
 * Class: SE433 - Homework8
 * Author: Raquib Talukder
 **/
/*
 *  !!!! This program may contain defects.
 */

public class Orders {

    private double tax;

    public enum ShippingMethod { Standard, NextDay };

    public static double calculateTotal(double rawTotal, ShippingMethod shippingMethod, String destinationState) {
        if (rawTotal <= 0) throw new IllegalArgumentException("Total must be positive.");
        double total = rawTotal;
        if (shippingMethod == ShippingMethod.Standard && total < 50) {
            total += 10;
        } else if (shippingMethod == ShippingMethod.NextDay) {
            total += 25;
        }
        if (destinationState.equals("California") ||
                destinationState.equals("Illinios") ||
                destinationState.equals("New York") ||
                destinationState.equals("CA") ||
                destinationState.equals("IL") ||
                destinationState.equals("NY")) {
            total += total * 0.06;
        }
        return total;
    }

}
