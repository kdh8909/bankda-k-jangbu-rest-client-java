package com.bankda.jangbu;

import com.bankda.jangbu.request.Auth;
import com.bankda.jangbu.request.kindergarten.SlipCisSend;
import com.bankda.jangbu.request.kindergarten.SlipSplitUpload;
import com.bankda.jangbu.request.kindergarten.SlipUpload;
import com.bankda.jangbu.response.AuthResponse;
import com.bankda.jangbu.response.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Jangbu {
    // 토큰 발급
    @POST("auth")
    Call<AuthResponse> createToken(@Body Auth auth);

    // 어린이집 - 전표 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip/{requestType}/user/{userId}")
    Call<RegisterResponse> registerSlipUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipUpload slipUpload
    );

    // 어린이집 - 전표 CIS 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-cis/{requestType}/user/{userId}")
    Call<RegisterResponse> registerSlipCisSend(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipCisSend slipCisSend
    );

    // 어린이집 - 전표 분할 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-split/{requestType}/user/{userId}")
    Call<RegisterResponse> registerSlipSplitUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipSplitUpload slipSplitUpload
    );

//    // 어린이집 - 예산 등록
//    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget/{requestType}/user/{userId}")
//    Call<RegisterResponse> registerBudgetUpload(
//            @Header("Authorization") String token,
//            @Path("jangbuId") String jangbuId,
//            @Path("serviceCode") String serviceCode,
//            @Path("requestType") String requestType,
//            @Path("userId") String userId,
//            @Body BudgetUpload budgetUpload
//    );

//    // 어린이집 - 예산 CIS 등록
//    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget-cis/{requestType}/user/{userId}")
//    Call<RegisterResponse> registerBudgetUpload(
//            @Header("Authorization") String token,
//            @Path("jangbuId") String jangbuId,
//            @Path("serviceCode") String serviceCode,
//            @Path("requestType") String requestType,
//            @Path("userId") String userId,
//            @Body BudgetCisSend budgetCisSend
//    );
//
//    // w4c - 데이터 등록
//    @POST("w4c/jangbu/{jangbuId}/service/{serviceCode}/slip/user/{userId}")
//    Call<RegisterResponse> registerW4cSlipUpload(
//            @Header("Authorization") String token,
//            @Path("jangbuId") String jangbuId,
//            @Path("serviceCode") String serviceCode,
//            @Path("userId") String userId,
//            @Body W4cSlipUpload w4cSlipUpload
//    );
//
//    // w4c - 월간 데이터 등록
//    @POST("w4c/jangbu/{jangbuId}/service/{serviceCode}/slip-monthly/user/{userId}")
//    Call<RegisterResponse> registerW4cSlipUploadMonthly(
//            @Header("Authorization") String token,
//            @Path("jangbuId") String jangbuId,
//            @Path("serviceCode") String serviceCode,
//            @Path("userId") String userId,
//            @Body W4cSlipUploadMonthly w4cSlipUploadMonthly
//    );
}
