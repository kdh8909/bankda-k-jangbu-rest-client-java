package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

public class WorkResultData {
    @SerializedName("rcode")
    private int rcode;

    @SerializedName("description")
    private String description;

    @SerializedName("success_cnt")
    private String success_cnt;

    @SerializedName("fail_cnt")
    private String fail_cnt;

    @SerializedName("result")
    private Object result;

    public int getRcode() {
        return rcode;
    }

    public String getDescription() {
        return description;
    }

    public String getSuccess_cnt() {
        return success_cnt;
    }

    public String getFail_cnt() {
        return fail_cnt;
    }

    public Object getResult() {
        return result;
    }
}
