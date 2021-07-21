package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SlipSplitUploadSlip {

    @SerializedName("BILL_DATE")
    private String BILL_DATE;

    @SerializedName("BILL_ORDER_DATE")
    private String BILL_ORDER_DATE;

    @SerializedName("ESTI_CODE")
    private String ESTI_CODE;

    @SerializedName("ESTI_INOUT")
    private String ESTI_INOUT;

    @SerializedName("BILL_MONEY")
    private String BILL_MONEY;

    @SerializedName("BILL_MEMO")
    private String BILL_MEMO;

    @SerializedName("BILL_BIGO")
    private String BILL_BIGO;

    @SerializedName("BILL_SUPPORT_AT")
    private String BILL_SUPPORT_AT;

    @SerializedName("BILL_NURI_AT")
    private String BILL_NURI_AT;

    @SerializedName("SETLE_MTHD")
    private String SETLE_MTHD;

    @SerializedName("VOUCHER")
    private List<SlipUploadVoucher> VOUCHER;

    public SlipSplitUploadSlip(String BILL_DATE, String BILL_ORDER_DATE, String ESTI_CODE, String ESTI_INOUT, String BILL_MONEY, String BILL_MEMO, String BILL_BIGO, String BILL_SUPPORT_AT, String BILL_NURI_AT, String SETLE_MTHD, List<SlipUploadVoucher> VOUCHER) {
        this.BILL_DATE = BILL_DATE;
        this.BILL_ORDER_DATE = BILL_ORDER_DATE;
        this.ESTI_CODE = ESTI_CODE;
        this.ESTI_INOUT = ESTI_INOUT;
        this.BILL_MONEY = BILL_MONEY;
        this.BILL_MEMO = BILL_MEMO;
        this.BILL_BIGO = BILL_BIGO;
        this.BILL_SUPPORT_AT = BILL_SUPPORT_AT;
        this.BILL_NURI_AT = BILL_NURI_AT;
        this.SETLE_MTHD = SETLE_MTHD;
        this.VOUCHER = VOUCHER;
    }
}
