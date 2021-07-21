package com.bankda.jangbu.exception;

import retrofit2.HttpException;

public class BankdaException extends Exception {
    private int httpStatusCode;
    private static final long serialVersionUID = 6880270585254162316L;
    public BankdaException(String error, HttpException exception) {
        super(error, exception);
        this.httpStatusCode = exception.code();
    }

    public int getHttpStatusCode() { return httpStatusCode; }
}
