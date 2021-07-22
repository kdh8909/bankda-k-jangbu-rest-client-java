package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 전표 분할 등록 데이터
 */
public class SlipSplitUploadData {
    @SerializedName("bank")
    private SlipSplitUploadBank bank;

    @SerializedName("slip")
    private List<SlipSplitUploadSlip> slip;

    public SlipSplitUploadData() { }

    public SlipSplitUploadData(SlipSplitUploadBank bank, List<SlipSplitUploadSlip> slip) {
        this.bank = bank;
        this.slip = slip;
    }

    public SlipSplitUploadBank getBank() {
        return bank;
    }

    public void setBank(SlipSplitUploadBank bank) {
        this.bank = bank;
    }

    public List<SlipSplitUploadSlip> getSlip() {
        return slip;
    }

    public void setSlip(List<SlipSplitUploadSlip> slip) {
        this.slip = slip;
    }
}
