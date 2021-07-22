package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

/**
 * 예산 CIS 등록 데이터
 */
public class BudgetCisSendData {
    @SerializedName("ESTI_YEAR")
    private String ESTI_YEAR;

    @SerializedName("ESTIM_NAME")
    private String ESTIM_NAME;

    public BudgetCisSendData() { }

    public BudgetCisSendData(String ESTI_YEAR, String ESTIM_NAME) {
        this.ESTI_YEAR = ESTI_YEAR;
        this.ESTIM_NAME = ESTIM_NAME;
    }

    public String getESTI_YEAR() {
        return ESTI_YEAR;
    }

    public void setESTI_YEAR(String ESTI_YEAR) {
        this.ESTI_YEAR = ESTI_YEAR;
    }

    public String getESTIM_NAME() {
        return ESTIM_NAME;
    }

    public void setESTIM_NAME(String ESTIM_NAME) {
        this.ESTIM_NAME = ESTIM_NAME;
    }
}
