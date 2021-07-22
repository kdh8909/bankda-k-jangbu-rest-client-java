package com.bankda.jangbu.request.auth;

import com.google.gson.annotations.SerializedName;

/**
 * 토큰 발급
 */
public class CreateToken {
    @SerializedName("version")
    private String version;

    @SerializedName("usertype")
    private String usertype;

    @SerializedName("userid")
    private String userid;

    @SerializedName("user_key")
    private String user_key;

    public CreateToken() { }

    public CreateToken(String version, String usertype, String userid, String user_key) {
        this.version = version;
        this.usertype = usertype;
        this.userid = userid;
        this.user_key = user_key;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUser_key() {
        return user_key;
    }

    public void setUser_key(String user_key) {
        this.user_key = user_key;
    }
}
