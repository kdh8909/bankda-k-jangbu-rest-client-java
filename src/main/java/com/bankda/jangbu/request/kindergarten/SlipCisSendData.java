package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

/**
 * 전표 CIS 등록 데이터 Request
 */
public class SlipCisSendData {
    @SerializedName("schYearMonth")
    private String schYearMonth;

    public SlipCisSendData(String schYearMonth) {
        this.schYearMonth = schYearMonth;
    }
}
