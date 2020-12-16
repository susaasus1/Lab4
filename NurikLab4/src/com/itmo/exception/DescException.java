package com.itmo.exception;

public class DescException extends Exception{

    public DescException(String message) {
        super("!!!" + message + "!!!");
    }
}