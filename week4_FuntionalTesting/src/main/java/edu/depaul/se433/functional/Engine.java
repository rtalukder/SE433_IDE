package edu.depaul.se433.functional;

/**
 * Class used to demonstrate ordering of tests.
 * @see EngineTest for details
 */
public class Engine {

    public enum EngineState {OFF, IDLE, RUNNING};

    private EngineState state = EngineState.OFF;

    public EngineState getState() {
        return state;
    }

    public void start() {
        if (state == EngineState.OFF) {
            state = EngineState.IDLE;
        } else {
            throw new InvalidTransitionException();
        }
    }

    public void run() {
        if (state == EngineState.IDLE) {
            state = EngineState.RUNNING;
        } else {
            throw new InvalidTransitionException();
        }
    }

    public void stop() {
        if ((state == EngineState.IDLE) || (state == EngineState.RUNNING)) {
            state = EngineState.OFF;
        } else {
            throw new InvalidTransitionException();
        }
    }

}
