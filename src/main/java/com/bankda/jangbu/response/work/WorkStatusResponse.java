package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

public class WorkStatusResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private int description;

    @SerializedName("status")
    private int status;

    public int getReturn_code() {
        return return_code;
    }

    public int getDescription() {
        return description;
    }

    public int getStatus() {
        return status;
    }
}
