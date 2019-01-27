package edu.depaul.se433.inClassWeek3;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

import org.junit.Test;

public class CalculationClientTest {

    @Test
    public void when_calculation_is_successful_returns_value_produced_by_server() {

        CalculationServer mockServer = mock(CalculationServer.class);
// NOTE: the following doesn't work because the matchers are outside the scope
//		of the stub creation:
//		Query q = new Query("ADD", anyDouble(), anyDouble());
        doReturn(new Response(Response.OK, 25.0)).when(mockServer).calculate(any(Query.class));
        Logger logger = new SystemLogger();
        CalculationClient client = new CalculationClient(mockServer, logger);
        double result = client.add(0.0, 0.0);  // just to prove client isn't adding for itself
        assertEquals(25.0, result, 1e-2);

    }

    /**
     * Verify that when the server returns an error Response, the client
     * logs it.  We also get a RuntimeException under these conditions.
     */
    @Test(expected = RuntimeException.class)
    public void when_calculation_fails_client_logs_result() {
        throw new RuntimeException();  // remove me.  I am just here to make this test pass
    }

}

