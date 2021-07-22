package com.bankda.jangbu.request;

import com.google.gson.annotations.SerializedName;

/**
 * 토큰 발급 Request
 */
public class Auth {
    @SerializedName("version")
    private String version;

    @SerializedName("usertype")
    private String usertype;

    @SerializedName("userid")
    private String userid;

    @SerializedName("user_key")
    private String user_key;

    public Auth() { }

    public Auth(String version, String usertype, String userid, String user_key) {
        this.version = version;
        this.usertype = usertype;
        this.userid = userid;
        this.user_key = user_key;
    }
}
