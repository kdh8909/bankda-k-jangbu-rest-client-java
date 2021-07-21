package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 전표 CIS 등록 Request
 */
public class SlipCisSend {
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

    @SerializedName("data")
    private List<SlipCisSendData> data;

    public SlipCisSend(String version, String request_type, String uid, String service_name, String trans_dtm, String memo, String record_count, List<SlipCisSendData> data) {
        this.version = version;
        this.request_type = request_type;
        this.uid = uid;
        this.service_name = service_name;
        this.trans_dtm = trans_dtm;
        this.memo = memo;
        this.record_count = record_count;
        this.data = data;
    }
}
