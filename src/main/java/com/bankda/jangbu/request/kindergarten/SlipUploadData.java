package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 전표 등록 데이터
 */
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
    private List<SlipUploadVoucher> VOUCHER;

    public SlipUploadData() { }

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

    public SlipUploadData(String TRANS_DATETIME, String BILL_DATE, String TRANS_DATE, String ESTI_CODE, String ESTI_INOUT, String BILL_MEMO, String BILL_BIGO, String BILL_SUPPORT_AT, String BILL_NURI_AT, String TRANS_GB, String TRANS_MONEY, String TRANS_MONEY_IN, String TRANS_MONEY_OUT, String TRANS_REMAIN, String TRANS_MEMO, String SETLE_MTHD, List<SlipUploadVoucher> VOUCHER) {
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

    public String getTRANS_DATETIME() {
        return TRANS_DATETIME;
    }

    public void setTRANS_DATETIME(String TRANS_DATETIME) {
        this.TRANS_DATETIME = TRANS_DATETIME;
    }

    public String getBILL_DATE() {
        return BILL_DATE;
    }

    public void setBILL_DATE(String BILL_DATE) {
        this.BILL_DATE = BILL_DATE;
    }

    public String getTRANS_DATE() {
        return TRANS_DATE;
    }

    public void setTRANS_DATE(String TRANS_DATE) {
        this.TRANS_DATE = TRANS_DATE;
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
