package com.bankda.jangbu.request.w4c;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * W4C 등록
 */
public class W4cSlipUpload {
    @SerializedName("version")
    private String version;

    @SerializedName("request_type")
    private String request_type;

    @SerializedName("uid")
    private String uid;

    @SerializedName("service_name")
    private String service_name;

    @SerializedName("sub_code")
    private String sub_code;

    @SerializedName("trans_dtm")
    private String trans_dtm;

    @SerializedName("memo")
    private String memo;

    @SerializedName("record_count")
    private String record_count;

    @SerializedName("data")
    private List<W4cSlipUploadData> data;

    public W4cSlipUpload() { }

    public W4cSlipUpload(String version, String request_type, String uid, String service_name, String sub_code, String trans_dtm, String memo, String record_count, List<W4cSlipUploadData> data) {
        this.version = version;
        this.request_type = request_type;
        this.uid = uid;
        this.service_name = service_name;
        this.sub_code = sub_code;
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

    public String getSub_code() {
        return sub_code;
    }

    public void setSub_code(String sub_code) {
        this.sub_code = sub_code;
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

    public List<W4cSlipUploadData> getData() {
        return data;
    }

    public void setData(List<W4cSlipUploadData> data) {
        this.data = data;
    }
}
