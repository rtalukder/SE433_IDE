package edu.depaul.se433.inClassWeek3;

/**
 * Represents the result from an operation carried out
 * by the CalculationServer
 */
public class Response {
    private String status;
    private double result;
    private String message;

    public final static String OK = "OK";
    public final static String FAILED = "INTERNAL ERROR";

    public Response(String status, double result) {
        this.status = status;
        this.result = result;
    }

    public Response(String message) {
        status = FAILED;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public double getResult() {
        return result;
    }

    public String getMessage() {
        return message;
    }
}

