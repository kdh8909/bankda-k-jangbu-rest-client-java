package com.bankda.jangbu.response.message;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 푸시 메시지 발송 결과 조회 Response
 */
public class MessageResultResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("data")
    private List<MessageResultData> data;

    public MessageResultResponse() { }

    public MessageResultResponse(int return_code, String description, List<MessageResultData> data) {
        this.return_code = return_code;
        this.description = description;
        this.data = data;
    }

    public int getReturn_code() {
        return return_code;
    }

    public void setReturn_code(int return_code) {
        this.return_code = return_code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<MessageResultData> getData() {
        return data;
    }

    public void setData(List<MessageResultData> data) {
        this.data = data;
    }
}
