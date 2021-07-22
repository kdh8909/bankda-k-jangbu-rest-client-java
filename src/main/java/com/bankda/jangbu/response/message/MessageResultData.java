package com.bankda.jangbu.response.message;

import com.google.gson.annotations.SerializedName;

public class MessageResultData {
    @SerializedName("title")
    private String title;

    @SerializedName("uid")
    private String uid;

    @SerializedName("status")
    private String status;

    @SerializedName("request_dtm")
    private String request_dtm;

    @SerializedName("receive_dtm")
    private String receive_dtm;

    public MessageResultData() { }

    public MessageResultData(String title, String uid, String status, String request_dtm, String receive_dtm) {
        this.title = title;
        this.uid = uid;
        this.status = status;
        this.request_dtm = request_dtm;
        this.receive_dtm = receive_dtm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest_dtm() {
        return request_dtm;
    }

    public void setRequest_dtm(String request_dtm) {
        this.request_dtm = request_dtm;
    }

    public String getReceive_dtm() {
        return receive_dtm;
    }

    public void setReceive_dtm(String receive_dtm) {
        this.receive_dtm = receive_dtm;
    }
}
