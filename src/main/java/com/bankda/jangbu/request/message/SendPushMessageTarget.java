package com.bankda.jangbu.request.message;

import com.google.gson.annotations.SerializedName;

/**
 * 푸시 메시지 발송 대상
 */
public class SendPushMessageTarget {
    @SerializedName("uid")
    private String uid;

    public SendPushMessageTarget() { }

    public SendPushMessageTarget(String uid) {
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
