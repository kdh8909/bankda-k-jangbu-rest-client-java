package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

public class WorkStatusResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("status")
    private String status;

    public int getReturn_code() {
        return return_code;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }
}
