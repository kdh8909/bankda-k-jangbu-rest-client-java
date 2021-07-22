package com.bankda.jangbu.response;

import com.google.gson.annotations.SerializedName;

/**
 * 업무 등록 Response
 */
public class RegisterResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("register_code")
    private String register_code;

    public RegisterResponse(int return_code, String description, String register_code) {
        this.return_code = return_code;
        this.description = description;
        this.register_code = register_code;
    }

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
