package edu.depaul.se433.functional;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edu.depaul.se433.functional.Engine.EngineState;

/**
 * Demonstrate executing tests in a specified order.
 * Comment out line 15 to see the result without order.
 * Our test goal: verify that the engine changes state
 * in the desired way.
 * QUESTION:
 * How can we rewrite the test so that order of tests
 * is no longer important?  Why might that be impractical
 * for some tests?
 * NOTE:
 * 1. this is not a good idea in a unit test but
 *    could be necessary in a functional test.
 * 2. Unlike a unit test, we have a single static instance
 *    of the class under test.
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EngineTest {

    private static Engine engine = new Engine();

    @Test
    public void t001_verify_start() {
        engine.start();
        assertEquals(EngineState.IDLE, engine.getState());
    }

    @Test
    public void t002_verify_run() {
        engine.run();
        assertEquals(EngineState.RUNNING, engine.getState());
    }

    @Test
    public void t003_verify_stop() {
        engine.stop();
        assertEquals(EngineState.OFF, engine.getState());
    }

}
