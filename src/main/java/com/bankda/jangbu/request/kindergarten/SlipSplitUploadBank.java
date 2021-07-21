package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

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
}
