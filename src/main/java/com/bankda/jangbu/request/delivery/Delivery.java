package com.bankda.jangbu.request.delivery;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 음식배달 등록
 */
public class Delivery {
    @SerializedName("version")
    private String version;

    @SerializedName("request_type")
    private String request_type;

    @SerializedName("uid")
    private String uid;

    @SerializedName("service_name")
    private String service_name;

    @SerializedName("provider_type")
    private String provider_type;

    @SerializedName("trans_dtm")
    private String trans_dtm;

    @SerializedName("memo")
    private String memo;

    @SerializedName("record_count")
    private String record_count;

    @SerializedName("data")
    private List<DeliveryData> data;

    public Delivery() { }

    public Delivery(String version, String request_type, String uid, String service_name, String trans_dtm, String memo, String record_count, List<DeliveryData> data) {
        this.version = version;
        this.request_type = request_type;
        this.uid = uid;
        this.service_name = service_name;
        this.trans_dtm = trans_dtm;
        this.memo = memo;
        this.record_count = record_count;
        this.data = data;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getService_name() {
        return service_name;
    }

    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    public String getProvider_type() {
        return provider_type;
    }

    public void setProvider_type(String provider_type) {
        this.provider_type = provider_type;
    }

    public String getTrans_dtm() {
        return trans_dtm;
    }

    public void setTrans_dtm(String trans_dtm) {
        this.trans_dtm = trans_dtm;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRecord_count() {
        return record_count;
    }

    public void setRecord_count(String record_count) {
        this.record_count = record_count;
    }

    public List<DeliveryData> getData() {
        return data;
    }

    public void setData(List<DeliveryData> data) {
        this.data = data;
    }
}
