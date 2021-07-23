package com.bankda.jangbu.response.work;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkVoucherData {
    @SerializedName("date")
    private int date;

    @SerializedName("tpath")
    private String tpath;

    @SerializedName("path")
    private String path;

    @SerializedName("bkcode")
    private String bkcode;

    public int getDate() {
        return date;
    }

    public String getTpath() {
        return tpath;
    }

    public String getPath() {
        return path;
    }

    public String getBkcode() {
        return bkcode;
    }
}
