package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

/**
 * 전표 등록 증빙 자료
 */
public class SlipUploadVoucher {
    @SerializedName("url")
    private String url;

    @SerializedName("filename")
    private String filename;

    public SlipUploadVoucher() { }

    public SlipUploadVoucher(String url, String filename) {
        this.url = url;
        this.filename = filename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
