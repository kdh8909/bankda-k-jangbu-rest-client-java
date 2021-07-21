package com.bankda.jangbu.request.kindergarten;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SlipSplitUploadData {
    @SerializedName("bank")
    private SlipSplitUploadBank bank;

    @SerializedName("slip")
    private List<SlipSplitUploadSlip> slip;

    public SlipSplitUploadData(SlipSplitUploadBank bank, List<SlipSplitUploadSlip> slip) {
        this.bank = bank;
        this.slip = slip;
    }
}
