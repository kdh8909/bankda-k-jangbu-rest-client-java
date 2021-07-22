package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

/**
 * 전표 분할 등록 거래내역
 */
public class SlipSplitUploadBank {
    @SerializedName("TRANS_DATETIME")
    private String TRANS_DATETIME;

    @SerializedName("TRANS_DATE")
    private String TRANS_DATE;

    @SerializedName("TRANS_GB")
    private String TRANS_GB;

    @SerializedName("TRANS_MONEY")
    private String TRANS_MONEY;

    @SerializedName("TRANS_MONEY_IN")
    private String TRANS_MONEY_IN;

    @SerializedName("TRANS_MONEY_OUT")
    private String TRANS_MONEY_OUT;

    @SerializedName("TRANS_REMAIN")
    private String TRANS_REMAIN;

    @SerializedName("TRANS_MEMO")
    private String TRANS_MEMO;

    public SlipSplitUploadBank() { }

    public SlipSplitUploadBank(String TRANS_DATETIME, String TRANS_DATE, String TRANS_GB, String TRANS_MONEY, String TRANS_MONEY_IN, String TRANS_MONEY_OUT, String TRANS_REMAIN, String TRANS_MEMO) {
        this.TRANS_DATETIME = TRANS_DATETIME;
        this.TRANS_DATE = TRANS_DATE;
        this.TRANS_GB = TRANS_GB;
        this.TRANS_MONEY = TRANS_MONEY;
        this.TRANS_MONEY_IN = TRANS_MONEY_IN;
        this.TRANS_MONEY_OUT = TRANS_MONEY_OUT;
        this.TRANS_REMAIN = TRANS_REMAIN;
        this.TRANS_MEMO = TRANS_MEMO;
    }

    public String getTRANS_DATETIME() {
        return TRANS_DATETIME;
    }

    public void setTRANS_DATETIME(String TRANS_DATETIME) {
        this.TRANS_DATETIME = TRANS_DATETIME;
    }

    public String getTRANS_DATE() {
        return TRANS_DATE;
    }

    public void setTRANS_DATE(String TRANS_DATE) {
        this.TRANS_DATE = TRANS_DATE;
    }

    public String getTRANS_GB() {
        return TRANS_GB;
    }

    public void setTRANS_GB(String TRANS_GB) {
        this.TRANS_GB = TRANS_GB;
    }

    public String getTRANS_MONEY() {
        return TRANS_MONEY;
    }

    public void setTRANS_MONEY(String TRANS_MONEY) {
        this.TRANS_MONEY = TRANS_MONEY;
    }

    public String getTRANS_MONEY_IN() {
        return TRANS_MONEY_IN;
    }

    public void setTRANS_MONEY_IN(String TRANS_MONEY_IN) {
        this.TRANS_MONEY_IN = TRANS_MONEY_IN;
    }

    public String getTRANS_MONEY_OUT() {
        return TRANS_MONEY_OUT;
    }

    public void setTRANS_MONEY_OUT(String TRANS_MONEY_OUT) {
        this.TRANS_MONEY_OUT = TRANS_MONEY_OUT;
    }

    public String getTRANS_REMAIN() {
        return TRANS_REMAIN;
    }

    public void setTRANS_REMAIN(String TRANS_REMAIN) {
        this.TRANS_REMAIN = TRANS_REMAIN;
    }

    public String getTRANS_MEMO() {
        return TRANS_MEMO;
    }

    public void setTRANS_MEMO(String TRANS_MEMO) {
        this.TRANS_MEMO = TRANS_MEMO;
    }
}
