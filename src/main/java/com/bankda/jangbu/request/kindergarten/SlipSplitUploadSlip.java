package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 전표 분할 등록 전표
 */
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
    @Expose
    private List<SlipUploadVoucher> VOUCHER;

    public SlipSplitUploadSlip() { }

    public SlipSplitUploadSlip(String BILL_DATE, String BILL_ORDER_DATE, String ESTI_CODE, String ESTI_INOUT, String BILL_MONEY, String BILL_MEMO, String BILL_BIGO, String BILL_SUPPORT_AT, String BILL_NURI_AT, String SETLE_MTHD) {
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
    }

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

    public String getBILL_DATE() {
        return BILL_DATE;
    }

    public void setBILL_DATE(String BILL_DATE) {
        this.BILL_DATE = BILL_DATE;
    }

    public String getBILL_ORDER_DATE() {
        return BILL_ORDER_DATE;
    }

    public void setBILL_ORDER_DATE(String BILL_ORDER_DATE) {
        this.BILL_ORDER_DATE = BILL_ORDER_DATE;
    }

    public String getESTI_CODE() {
        return ESTI_CODE;
    }

    public void setESTI_CODE(String ESTI_CODE) {
        this.ESTI_CODE = ESTI_CODE;
    }

    public String getESTI_INOUT() {
        return ESTI_INOUT;
    }

    public void setESTI_INOUT(String ESTI_INOUT) {
        this.ESTI_INOUT = ESTI_INOUT;
    }

    public String getBILL_MONEY() {
        return BILL_MONEY;
    }

    public void setBILL_MONEY(String BILL_MONEY) {
        this.BILL_MONEY = BILL_MONEY;
    }

    public String getBILL_MEMO() {
        return BILL_MEMO;
    }

    public void setBILL_MEMO(String BILL_MEMO) {
        this.BILL_MEMO = BILL_MEMO;
    }

    public String getBILL_BIGO() {
        return BILL_BIGO;
    }

    public void setBILL_BIGO(String BILL_BIGO) {
        this.BILL_BIGO = BILL_BIGO;
    }

    public String getBILL_SUPPORT_AT() {
        return BILL_SUPPORT_AT;
    }

    public void setBILL_SUPPORT_AT(String BILL_SUPPORT_AT) {
        this.BILL_SUPPORT_AT = BILL_SUPPORT_AT;
    }

    public String getBILL_NURI_AT() {
        return BILL_NURI_AT;
    }

    public void setBILL_NURI_AT(String BILL_NURI_AT) {
        this.BILL_NURI_AT = BILL_NURI_AT;
    }

    public String getSETLE_MTHD() {
        return SETLE_MTHD;
    }

    public void setSETLE_MTHD(String SETLE_MTHD) {
        this.SETLE_MTHD = SETLE_MTHD;
    }

    public List<SlipUploadVoucher> getVOUCHER() {
        return VOUCHER;
    }

    public void setVOUCHER(List<SlipUploadVoucher> VOUCHER) {
        this.VOUCHER = VOUCHER;
    }
}
