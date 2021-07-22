package com.bankda.jangbu.request.delivery;

import com.google.gson.annotations.SerializedName;

/**
 * 음식배달 등록 데이터
 */
public class DeliveryData {
    @SerializedName("userid")
    private String userid;

    @SerializedName("password")
    private String password;

    @SerializedName("startdate")
    private String startdate;

    @SerializedName("enddate")
    private String enddate;

    @SerializedName("company_number")
    private String company_number;

    public DeliveryData() { }

    public DeliveryData(String userid, String password, String startdate, String enddate, String company_number) {
        this.userid = userid;
        this.password = password;
        this.startdate = startdate;
        this.enddate = enddate;
        this.company_number = company_number;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate;
    }

    public String getCompany_number() {
        return company_number;
    }

    public void setCompany_number(String company_number) {
        this.company_number = company_number;
    }
}
