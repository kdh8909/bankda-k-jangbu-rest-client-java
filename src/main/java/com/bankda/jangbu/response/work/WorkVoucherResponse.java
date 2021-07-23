package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkVoucherResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("count")
    private int count;

    @SerializedName("data")
    private List<WorkResultData> data;

    public int getReturn_code() {
        return return_code;
    }

    public String getDescription() {
        return description;
    }

    public int getCount() {
        return count;
    }

    public List<WorkResultData> getData() {
        return data;
    }
}
