package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

public class SlipUploadVoucher {
    @SerializedName("url")
    private String url;

    @SerializedName("filename")
    private String filename;

    public SlipUploadVoucher(String url, String filename) {
        this.url = url;
        this.filename = filename;
    }
}
