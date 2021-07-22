package com.bankda.jangbu.response.message;


import com.google.gson.annotations.SerializedName;

class SendMessageTarget {
    @SerializedName("uid")
    private String uid;

    @SerializedName("result")
    private String result;

    public SendMessageTarget() { }

    public SendMessageTarget(String uid, String result) {
        this.uid = uid;
        this.result = result;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
