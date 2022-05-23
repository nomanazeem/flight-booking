package com.nazeem.flight.booking.exception;

public class InsufficientAmountException extends  RuntimeException{
    public InsufficientAmountException(String message){
        super(message);
    }
}
