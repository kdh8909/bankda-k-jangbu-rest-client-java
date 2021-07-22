package com.bankda.jangbu.request.auth;

import com.google.gson.annotations.SerializedName;

/**
 * 토큰 갱신
 */
public class RefreshToken {
    @SerializedName("version")
    private String version;

    @SerializedName("refresh_token")
    private String refresh_token;

    public RefreshToken() { }

    public RefreshToken(String version, String refresh_token) {
        this.version = version;
        this.refresh_token = refresh_token;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
}
