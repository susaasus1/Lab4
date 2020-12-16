package com.itmo.exception;

public class ExistException extends NullPointerException {
    private String trouble = "- пустое поле имени";

    public ExistException(String s){
        super(s);
        trouble = s + trouble;
    }

    public String getExc() {
        return trouble;
    }
}
