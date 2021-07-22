package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkResultResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("status")
    private String status;

    @SerializedName("data")
    private List<WorkResultData> data;

    public int getReturn_code() {
        return return_code;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public List<WorkResultData> getData() {
        return data;
    }
}
