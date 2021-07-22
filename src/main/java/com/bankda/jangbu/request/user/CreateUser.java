package com.bankda.jangbu.request.user;

import com.google.gson.annotations.SerializedName;

public class CreateUser {
    @SerializedName("version")
    private String version;

    @SerializedName("service_name")
    private String service_name;

    @SerializedName("jid")
    private String jid;

    @SerializedName("uid")
    private String uid;

    @SerializedName("name")
    private String name;

    @SerializedName("ceo")
    private String ceo;

    @SerializedName("phone")
    private String phone;

    @SerializedName("email")
    private String email;

    public CreateUser() { }

    public CreateUser(String version, String service_name, String jid, String uid, String name, String ceo, String phone, String email) {
        this.version = version;
        this.service_name = service_name;
        this.jid = jid;
        this.uid = uid;
        this.name = name;
        this.ceo = ceo;
        this.phone = phone;
        this.email = email;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getJid() {
        return jid;
    }

    public void setJid(String jid) {
        this.jid = jid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
