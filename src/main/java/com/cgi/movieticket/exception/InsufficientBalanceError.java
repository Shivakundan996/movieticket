package com.cgi.movieticket.exception;

public class InsufficientBalanceError extends RuntimeException {
    public InsufficientBalanceError(String message) {
        super(message);
    }
}
