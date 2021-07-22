package com.bankda.jangbu.response.message;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 푸시 메시지 발송 요청 Response
 */
public class SendMessageResponse {
    @SerializedName("return_code")
    private int return_code;

    @SerializedName("description")
    private String description;

    @SerializedName("register_code")
    private int register_code;

    @SerializedName("target")
    private List<SendMessageTarget> target;

    public SendMessageResponse() { }

    public SendMessageResponse(int return_code, String description, int register_code, List<SendMessageTarget> target) {
        this.return_code = return_code;
        this.description = description;
        this.register_code = register_code;
        this.target = target;
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

    public int getRegister_code() {
        return register_code;
    }

    public void setRegister_code(int register_code) {
        this.register_code = register_code;
    }

    public List<SendMessageTarget> getTarget() {
        return target;
    }

    public void setTarget(List<SendMessageTarget> target) {
        this.target = target;
    }
}
