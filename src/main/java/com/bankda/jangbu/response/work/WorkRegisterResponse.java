package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

/**
 * 업무 등록 Response
 */
public class WorkRegisterResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("register_code")
    private String register_code;

    public int getReturn_code() {
        return return_code;
    }

    public String getDescription() {
        return description;
    }

    public String getRegister_code() {
        return register_code;
    }
}
