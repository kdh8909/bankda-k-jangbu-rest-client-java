package com.bankda.jangbu.response.auth;

import com.google.gson.annotations.SerializedName;

/**
 * 토큰 발급 Response
 */
public class AuthResponse {

    @SerializedName("return_code")
    int return_code;

    @SerializedName("description")
    String description;

    @SerializedName("jangbuname")
    String jangbuname;

    @SerializedName("username")
    String username;

    @SerializedName("access_token")
    String access_token;

    @SerializedName("refresh_token")
    String refresh_token;

    @SerializedName("expdtm")
    String expdtm;

    public int getReturn_code() {
        return return_code;
    }

    public String getDescription() {
        return description;
    }

    public String getJangbuname() {
        return jangbuname;
    }

    public String getUsername() {
        return username;
    }

    public String getAccess_token() {
        return access_token;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public String getExpdtm() {
        return expdtm;
    }
}
