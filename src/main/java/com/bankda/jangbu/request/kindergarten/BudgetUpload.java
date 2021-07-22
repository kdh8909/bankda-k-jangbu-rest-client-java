package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 예산 등록
 */
public class BudgetUpload {
    @SerializedName("version")
    private String version;

    @SerializedName("request_type")
    private String request_type;

    @SerializedName("uid")
    private String uid;

    @SerializedName("service_name")
    private String service_name;

    @SerializedName("trans_dtm")
    private String trans_dtm;

    @SerializedName("memo")
    private String memo;

    @SerializedName("record_count")
    private String record_count;

    @SerializedName("budget_year")
    private String budget_year;

    @SerializedName("estim_name")
    private String estim_name;

    @SerializedName("data")
    private List<BudgetUploadData> data;

    public BudgetUpload() { }

    public BudgetUpload(String version, String request_type, String uid, String service_name, String trans_dtm, String memo, String record_count, String budget_year, String estim_name, List<BudgetUploadData> data) {
        this.version = version;
        this.request_type = request_type;
        this.uid = uid;
        this.service_name = service_name;
        this.trans_dtm = trans_dtm;
        this.memo = memo;
        this.record_count = record_count;
        this.budget_year = budget_year;
        this.estim_name = estim_name;
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

    public String getBudget_year() {
        return budget_year;
    }

    public void setBudget_year(String budget_year) {
        this.budget_year = budget_year;
    }

    public String getEstim_name() {
        return estim_name;
    }

    public void setEstim_name(String estim_name) {
        this.estim_name = estim_name;
    }

    public List<BudgetUploadData> getData() {
        return data;
    }

    public void setData(List<BudgetUploadData> data) {
        this.data = data;
    }
}
