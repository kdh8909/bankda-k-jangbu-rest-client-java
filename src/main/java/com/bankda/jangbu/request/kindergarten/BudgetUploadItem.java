package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * 예산 내역 목록
 */
public class BudgetUploadItem {

    @SerializedName("ESTI_OUT_NAME")
    private String ESTI_OUT_NAME;

    @SerializedName("ESTI_OUT_MONEY")
    private String ESTI_OUT_MONEY;

    @SerializedName("ESTI_OUT_BASICNUM1")
    @Expose
    private String ESTI_OUT_BASICNUM1;

    @SerializedName("ESTI_OUT_BASICTEXT1")
    @Expose
    private String ESTI_OUT_BASICTEXT1;

    @SerializedName("ESTI_OUT_BASICNUM2")
    @Expose
    private String ESTI_OUT_BASICNUM2;

    @SerializedName("ESTI_OUT_BASICTEXT2")
    @Expose
    private String ESTI_OUT_BASICTEXT2;

    @SerializedName("ESTI_OUT_BASICNUM3")
    @Expose
    private String ESTI_OUT_BASICNUM3;

    @SerializedName("ESTI_OUT_BASICTEXT4")
    @Expose
    private String ESTI_OUT_BASICTEXT4;

    @SerializedName("ESTI_OUT_BASICNUM5")
    @Expose
    private String ESTI_OUT_BASICNUM5;

    @SerializedName("ESTI_OUT_BASICTEXT6")
    @Expose
    private String ESTI_OUT_BASICTEXT6;

    @SerializedName("ESTI_OUT_BASICNUM7")
    @Expose
    private String ESTI_OUT_BASICNUM7;

    @SerializedName("ESTI_OUT_BASICTEXT8")
    @Expose
    private String ESTI_OUT_BASICTEXT8;

    @SerializedName("ESTI_OUT_BASICNUM9")
    @Expose
    private String ESTI_OUT_BASICNUM9;

    @SerializedName("ESTI_OUT_TOTMONEY")
    private String ESTI_OUT_TOTMONEY;

    public BudgetUploadItem() { }

    public BudgetUploadItem(String ESTI_OUT_NAME, String ESTI_OUT_MONEY, String ESTI_OUT_BASICNUM1, String ESTI_OUT_BASICTEXT1, String ESTI_OUT_BASICNUM2, String ESTI_OUT_BASICTEXT2, String ESTI_OUT_BASICNUM3, String ESTI_OUT_BASICTEXT4, String ESTI_OUT_BASICNUM5, String ESTI_OUT_BASICTEXT6, String ESTI_OUT_BASICNUM7, String ESTI_OUT_BASICTEXT8, String ESTI_OUT_BASICNUM9, String ESTI_OUT_TOTMONEY) {
        this.ESTI_OUT_NAME = ESTI_OUT_NAME;
        this.ESTI_OUT_MONEY = ESTI_OUT_MONEY;
        this.ESTI_OUT_BASICNUM1 = ESTI_OUT_BASICNUM1;
        this.ESTI_OUT_BASICTEXT1 = ESTI_OUT_BASICTEXT1;
        this.ESTI_OUT_BASICNUM2 = ESTI_OUT_BASICNUM2;
        this.ESTI_OUT_BASICTEXT2 = ESTI_OUT_BASICTEXT2;
        this.ESTI_OUT_BASICNUM3 = ESTI_OUT_BASICNUM3;
        this.ESTI_OUT_BASICTEXT4 = ESTI_OUT_BASICTEXT4;
        this.ESTI_OUT_BASICNUM5 = ESTI_OUT_BASICNUM5;
        this.ESTI_OUT_BASICTEXT6 = ESTI_OUT_BASICTEXT6;
        this.ESTI_OUT_BASICNUM7 = ESTI_OUT_BASICNUM7;
        this.ESTI_OUT_BASICTEXT8 = ESTI_OUT_BASICTEXT8;
        this.ESTI_OUT_BASICNUM9 = ESTI_OUT_BASICNUM9;
        this.ESTI_OUT_TOTMONEY = ESTI_OUT_TOTMONEY;
    }

    public String getESTI_OUT_NAME() {
        return ESTI_OUT_NAME;
    }

    public void setESTI_OUT_NAME(String ESTI_OUT_NAME) {
        this.ESTI_OUT_NAME = ESTI_OUT_NAME;
    }

    public String getESTI_OUT_MONEY() {
        return ESTI_OUT_MONEY;
    }

    public void setESTI_OUT_MONEY(String ESTI_OUT_MONEY) {
        this.ESTI_OUT_MONEY = ESTI_OUT_MONEY;
    }

    public String getESTI_OUT_BASICNUM1() {
        return ESTI_OUT_BASICNUM1;
    }

    public void setESTI_OUT_BASICNUM1(String ESTI_OUT_BASICNUM1) {
        this.ESTI_OUT_BASICNUM1 = ESTI_OUT_BASICNUM1;
    }

    public String getESTI_OUT_BASICTEXT1() {
        return ESTI_OUT_BASICTEXT1;
    }

    public void setESTI_OUT_BASICTEXT1(String ESTI_OUT_BASICTEXT1) {
        this.ESTI_OUT_BASICTEXT1 = ESTI_OUT_BASICTEXT1;
    }

    public String getESTI_OUT_BASICNUM2() {
        return ESTI_OUT_BASICNUM2;
    }

    public void setESTI_OUT_BASICNUM2(String ESTI_OUT_BASICNUM2) {
        this.ESTI_OUT_BASICNUM2 = ESTI_OUT_BASICNUM2;
    }

    public String getESTI_OUT_BASICTEXT2() {
        return ESTI_OUT_BASICTEXT2;
    }

    public void setESTI_OUT_BASICTEXT2(String ESTI_OUT_BASICTEXT2) {
        this.ESTI_OUT_BASICTEXT2 = ESTI_OUT_BASICTEXT2;
    }

    public String getESTI_OUT_BASICNUM3() {
        return ESTI_OUT_BASICNUM3;
    }

    public void setESTI_OUT_BASICNUM3(String ESTI_OUT_BASICNUM3) {
        this.ESTI_OUT_BASICNUM3 = ESTI_OUT_BASICNUM3;
    }

    public String getESTI_OUT_BASICTEXT4() {
        return ESTI_OUT_BASICTEXT4;
    }

    public void setESTI_OUT_BASICTEXT4(String ESTI_OUT_BASICTEXT4) {
        this.ESTI_OUT_BASICTEXT4 = ESTI_OUT_BASICTEXT4;
    }

    public String getESTI_OUT_BASICNUM5() {
        return ESTI_OUT_BASICNUM5;
    }

    public void setESTI_OUT_BASICNUM5(String ESTI_OUT_BASICNUM5) {
        this.ESTI_OUT_BASICNUM5 = ESTI_OUT_BASICNUM5;
    }

    public String getESTI_OUT_BASICTEXT6() {
        return ESTI_OUT_BASICTEXT6;
    }

    public void setESTI_OUT_BASICTEXT6(String ESTI_OUT_BASICTEXT6) {
        this.ESTI_OUT_BASICTEXT6 = ESTI_OUT_BASICTEXT6;
    }

    public String getESTI_OUT_BASICNUM7() {
        return ESTI_OUT_BASICNUM7;
    }

    public void setESTI_OUT_BASICNUM7(String ESTI_OUT_BASICNUM7) {
        this.ESTI_OUT_BASICNUM7 = ESTI_OUT_BASICNUM7;
    }

    public String getESTI_OUT_BASICTEXT8() {
        return ESTI_OUT_BASICTEXT8;
    }

    public void setESTI_OUT_BASICTEXT8(String ESTI_OUT_BASICTEXT8) {
        this.ESTI_OUT_BASICTEXT8 = ESTI_OUT_BASICTEXT8;
    }

    public String getESTI_OUT_BASICNUM9() {
        return ESTI_OUT_BASICNUM9;
    }

    public void setESTI_OUT_BASICNUM9(String ESTI_OUT_BASICNUM9) {
        this.ESTI_OUT_BASICNUM9 = ESTI_OUT_BASICNUM9;
    }

    public String getESTI_OUT_TOTMONEY() {
        return ESTI_OUT_TOTMONEY;
    }

    public void setESTI_OUT_TOTMONEY(String ESTI_OUT_TOTMONEY) {
        this.ESTI_OUT_TOTMONEY = ESTI_OUT_TOTMONEY;
    }
}
