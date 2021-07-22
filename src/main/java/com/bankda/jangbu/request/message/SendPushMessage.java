package com.bankda.jangbu.request.message;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 푸시 메시지 발송
 */
public class SendPushMessage {
    @SerializedName("version")
    private String version;

    @SerializedName("title")
    private String title;

    @SerializedName("content")
    private String content;

    @SerializedName("target")
    private List<SendPushMessageTarget> target;

    public SendPushMessage() { }

    public SendPushMessage(String version, String title, String content, List<SendPushMessageTarget> target) {
        this.version = version;
        this.title = title;
        this.content = content;
        this.target = target;
    }
}
