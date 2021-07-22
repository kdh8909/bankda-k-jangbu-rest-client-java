package com.bankda.jangbu.request.edi;

import com.google.gson.annotations.SerializedName;

/**
 * EDI 등록 데이터
 */
public class EdiData {
    @SerializedName("mgmtNo")
    private String mgmtNo;

    @SerializedName("yyyyMM")
    private String yyyyMM;

    public EdiData() { }

    public EdiData(String mgmtNo, String yyyyMM) {
        this.mgmtNo = mgmtNo;
        this.yyyyMM = yyyyMM;
    }

    public String getMgmtNo() {
        return mgmtNo;
    }

    public void setMgmtNo(String mgmtNo) {
        this.mgmtNo = mgmtNo;
    }

    public String getYyyyMM() {
        return yyyyMM;
    }

    public void setYyyyMM(String yyyyMM) {
        this.yyyyMM = yyyyMM;
    }
}
