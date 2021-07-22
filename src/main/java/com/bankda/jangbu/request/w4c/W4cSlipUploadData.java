package com.bankda.jangbu.request.w4c;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * W4C 등록 데이터
 */
public class W4cSlipUploadData {
    @SerializedName("DFRT_DE")
    private String DFRT_DE;

    @SerializedName("ACC_NM")
    private String ACC_NM;

    @SerializedName("REMK")
    private String REMK;

    @SerializedName("CR_TMM_OCUR_AMT")
    private String CR_TMM_OCUR_AMT;

    @SerializedName("DR_TMM_OCUR_AMT")
    private String DR_TMM_OCUR_AMT;

    @SerializedName("OPNT_ACC_NM")
    private String OPNT_ACC_NM;

    @SerializedName("FDSRC_NM")
    private String FDSRC_NM;

    @SerializedName("BCNC_NM")
    private String BCNC_NM;

    @SerializedName("BSNS_NM")
    private String BSNS_NM;

    @SerializedName("ACCT_NUMBER")
    private String ACCT_NUMBER;

    @SerializedName("ACCT_MNGT_NM")
    private String ACCT_MNGT_NM;

    public W4cSlipUploadData() { }

    public W4cSlipUploadData(String DFRT_DE, String ACC_NM, String REMK, String CR_TMM_OCUR_AMT, String DR_TMM_OCUR_AMT, String OPNT_ACC_NM, String FDSRC_NM, String BCNC_NM, String BSNS_NM, String ACCT_NUMBER, String ACCT_MNGT_NM) {
        this.DFRT_DE = DFRT_DE;
        this.ACC_NM = ACC_NM;
        this.REMK = REMK;
        this.CR_TMM_OCUR_AMT = CR_TMM_OCUR_AMT;
        this.DR_TMM_OCUR_AMT = DR_TMM_OCUR_AMT;
        this.OPNT_ACC_NM = OPNT_ACC_NM;
        this.FDSRC_NM = FDSRC_NM;
        this.BCNC_NM = BCNC_NM;
        this.BSNS_NM = BSNS_NM;
        this.ACCT_NUMBER = ACCT_NUMBER;
        this.ACCT_MNGT_NM = ACCT_MNGT_NM;
    }

    public String getDFRT_DE() {
        return DFRT_DE;
    }

    public void setDFRT_DE(String DFRT_DE) {
        this.DFRT_DE = DFRT_DE;
    }

    public String getACC_NM() {
        return ACC_NM;
    }

    public void setACC_NM(String ACC_NM) {
        this.ACC_NM = ACC_NM;
    }

    public String getREMK() {
        return REMK;
    }

    public void setREMK(String REMK) {
        this.REMK = REMK;
    }

    public String getCR_TMM_OCUR_AMT() {
        return CR_TMM_OCUR_AMT;
    }

    public void setCR_TMM_OCUR_AMT(String CR_TMM_OCUR_AMT) {
        this.CR_TMM_OCUR_AMT = CR_TMM_OCUR_AMT;
    }

    public String getDR_TMM_OCUR_AMT() {
        return DR_TMM_OCUR_AMT;
    }

    public void setDR_TMM_OCUR_AMT(String DR_TMM_OCUR_AMT) {
        this.DR_TMM_OCUR_AMT = DR_TMM_OCUR_AMT;
    }

    public String getOPNT_ACC_NM() {
        return OPNT_ACC_NM;
    }

    public void setOPNT_ACC_NM(String OPNT_ACC_NM) {
        this.OPNT_ACC_NM = OPNT_ACC_NM;
    }

    public String getFDSRC_NM() {
        return FDSRC_NM;
    }

    public void setFDSRC_NM(String FDSRC_NM) {
        this.FDSRC_NM = FDSRC_NM;
    }

    public String getBCNC_NM() {
        return BCNC_NM;
    }

    public void setBCNC_NM(String BCNC_NM) {
        this.BCNC_NM = BCNC_NM;
    }

    public String getBSNS_NM() {
        return BSNS_NM;
    }

    public void setBSNS_NM(String BSNS_NM) {
        this.BSNS_NM = BSNS_NM;
    }

    public String getACCT_NUMBER() {
        return ACCT_NUMBER;
    }

    public void setACCT_NUMBER(String ACCT_NUMBER) {
        this.ACCT_NUMBER = ACCT_NUMBER;
    }

    public String getACCT_MNGT_NM() {
        return ACCT_MNGT_NM;
    }

    public void setACCT_MNGT_NM(String ACCT_MNGT_NM) {
        this.ACCT_MNGT_NM = ACCT_MNGT_NM;
    }
}
