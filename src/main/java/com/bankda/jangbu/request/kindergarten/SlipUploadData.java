package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

public class SlipUploadData {
    @SerializedName("TRANS_DATETIME")
    private String TRANS_DATETIME;

    @SerializedName("BILL_DATE")
    private String BILL_DATE;

    @SerializedName("TRANS_DATE")
    private String TRANS_DATE;

    @SerializedName("ESTI_CODE")
    private String ESTI_CODE;

    @SerializedName("ESTI_INOUT")
    private String ESTI_INOUT;

    @SerializedName("BILL_MEMO")
    private String BILL_MEMO;

    @SerializedName("BILL_BIGO")
    private String BILL_BIGO;

    @SerializedName("BILL_SUPPORT_AT")
    private String BILL_SUPPORT_AT;

    @SerializedName("BILL_NURI_AT")
    private String BILL_NURI_AT;

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

    @SerializedName("SETLE_MTHD")
    private String SETLE_MTHD;

    @SerializedName("VOUCHER")
    private SlipUploadVoucher VOUCHER;

    public SlipUploadData(String TRANS_DATETIME, String BILL_DATE, String TRANS_DATE, String ESTI_CODE, String ESTI_INOUT, String BILL_MEMO, String BILL_BIGO, String BILL_SUPPORT_AT, String BILL_NURI_AT, String TRANS_GB, String TRANS_MONEY, String TRANS_MONEY_IN, String TRANS_MONEY_OUT, String TRANS_REMAIN, String TRANS_MEMO, String SETLE_MTHD) {
        this.TRANS_DATETIME = TRANS_DATETIME;
        this.BILL_DATE = BILL_DATE;
        this.TRANS_DATE = TRANS_DATE;
        this.ESTI_CODE = ESTI_CODE;
        this.ESTI_INOUT = ESTI_INOUT;
        this.BILL_MEMO = BILL_MEMO;
        this.BILL_BIGO = BILL_BIGO;
        this.BILL_SUPPORT_AT = BILL_SUPPORT_AT;
        this.BILL_NURI_AT = BILL_NURI_AT;
        this.TRANS_GB = TRANS_GB;
        this.TRANS_MONEY = TRANS_MONEY;
        this.TRANS_MONEY_IN = TRANS_MONEY_IN;
        this.TRANS_MONEY_OUT = TRANS_MONEY_OUT;
        this.TRANS_REMAIN = TRANS_REMAIN;
        this.TRANS_MEMO = TRANS_MEMO;
        this.SETLE_MTHD = SETLE_MTHD;
    }

    public SlipUploadData(String TRANS_DATETIME, String BILL_DATE, String TRANS_DATE, String ESTI_CODE, String ESTI_INOUT, String BILL_MEMO, String BILL_BIGO, String BILL_SUPPORT_AT, String BILL_NURI_AT, String TRANS_GB, String TRANS_MONEY, String TRANS_MONEY_IN, String TRANS_MONEY_OUT, String TRANS_REMAIN, String TRANS_MEMO, String SETLE_MTHD, SlipUploadVoucher VOUCHER) {
        this.TRANS_DATETIME = TRANS_DATETIME;
        this.BILL_DATE = BILL_DATE;
        this.TRANS_DATE = TRANS_DATE;
        this.ESTI_CODE = ESTI_CODE;
        this.ESTI_INOUT = ESTI_INOUT;
        this.BILL_MEMO = BILL_MEMO;
        this.BILL_BIGO = BILL_BIGO;
        this.BILL_SUPPORT_AT = BILL_SUPPORT_AT;
        this.BILL_NURI_AT = BILL_NURI_AT;
        this.TRANS_GB = TRANS_GB;
        this.TRANS_MONEY = TRANS_MONEY;
        this.TRANS_MONEY_IN = TRANS_MONEY_IN;
        this.TRANS_MONEY_OUT = TRANS_MONEY_OUT;
        this.TRANS_REMAIN = TRANS_REMAIN;
        this.TRANS_MEMO = TRANS_MEMO;
        this.SETLE_MTHD = SETLE_MTHD;
        this.VOUCHER = VOUCHER;
    }


}
