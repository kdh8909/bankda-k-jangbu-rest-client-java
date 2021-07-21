package com.bankda.jangbu.response;

import com.google.gson.annotations.SerializedName;

/**
 * 공용 Response
 * @param <T>
 */
public class BankdaResponse<T> {
    @SerializedName("code")
    int code;

    @SerializedName("message")
    String message;

    @SerializedName("response")
    T response;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getResponse() {
        return response;
    }
}
