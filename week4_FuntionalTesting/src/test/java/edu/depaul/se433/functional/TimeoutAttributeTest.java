package edu.depaul.se433.functional;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Demonstrate the timeout attribute that is supported in
 * the @Test annotation.
 * Try changing the timeout value to that the test fails
 */
public class TimeoutAttributeTest {

    @Test(timeout = 5000)
    public void verify_timeout_attribute_works() throws InterruptedException {
        Thread.sleep(1000);
    }

}
