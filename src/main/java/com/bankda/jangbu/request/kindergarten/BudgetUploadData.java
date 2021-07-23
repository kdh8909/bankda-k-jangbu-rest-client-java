package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 예산 등록 데이터
 */
public class BudgetUploadData {
    @SerializedName("ESTI_DISPLAY")
    private String ESTI_DISPLAY;

    @SerializedName("ESTI_INOUT")
    private String ESTI_INOUT;

    @SerializedName("TOTAL_MONEY")
    private String TOTAL_MONEY;

    @SerializedName("budget_item")
    private List<BudgetUploadItem> budget_item;

    public BudgetUploadData() { }

    public BudgetUploadData(String ESTI_DISPLAY, String ESTI_INOUT, String TOTAL_MONEY, List<BudgetUploadItem> budget_item) {
        this.ESTI_DISPLAY = ESTI_DISPLAY;
        this.ESTI_INOUT = ESTI_INOUT;
        this.TOTAL_MONEY = TOTAL_MONEY;
        this.budget_item = budget_item;
    }

    public String getESTI_DISPLAY() {
        return ESTI_DISPLAY;
    }

    public void setESTI_DISPLAY(String ESTI_DISPLAY) {
        this.ESTI_DISPLAY = ESTI_DISPLAY;
    }

    public String getESTI_INOUT() {
        return ESTI_INOUT;
    }

    public void setESTI_INOUT(String ESTI_INOUT) {
        this.ESTI_INOUT = ESTI_INOUT;
    }

    public String getTOTAL_MONEY() {
        return TOTAL_MONEY;
    }

    public void setTOTAL_MONEY(String TOTAL_MONEY) {
        this.TOTAL_MONEY = TOTAL_MONEY;
    }

    public List<BudgetUploadItem> getBudget_item() {
        return budget_item;
    }

    public void setBudget_item(List<BudgetUploadItem> budget_item) {
        this.budget_item = budget_item;
    }
}
