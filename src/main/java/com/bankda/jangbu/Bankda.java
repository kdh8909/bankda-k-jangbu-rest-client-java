package com.bankda.jangbu;

import com.bankda.jangbu.request.auth.CreateToken;
import com.bankda.jangbu.request.auth.RefreshToken;
import com.bankda.jangbu.request.delivery.Delivery;
import com.bankda.jangbu.request.edi.Edi;
import com.bankda.jangbu.request.kindergarten.*;
import com.bankda.jangbu.request.message.SendPushMessage;
import com.bankda.jangbu.request.user.CreateUser;
import com.bankda.jangbu.request.w4c.W4cSlipUpload;
import com.bankda.jangbu.request.w4c.W4cSlipUploadMonthly;
import com.bankda.jangbu.response.auth.AuthResponse;
import com.bankda.jangbu.response.message.MessageResultResponse;
import com.bankda.jangbu.response.message.SendMessageResponse;
import com.bankda.jangbu.response.work.WorkRegisterResponse;
import com.bankda.jangbu.response.work.WorkResultResponse;
import com.bankda.jangbu.response.work.WorkStatusResponse;
import com.bankda.jangbu.response.work.WorkVoucherResponse;
import retrofit2.Call;
import retrofit2.http.*;

public interface Bankda {
    // 토큰 발급
    @POST("auth")
    Call<AuthResponse> createToken(@Body CreateToken createToken);

    // 토큰 갱신
    @PUT("auth")
    Call<AuthResponse> refreshToken(@Body RefreshToken refreshToken);

    // 고객 회원 등록
    @POST("user")
    Call<String> registerUser(@Body CreateUser createUser);

    // 푸시 메시지 발송 요청
    @POST("message")
    Call<SendMessageResponse> sendPushMessage(@Body SendPushMessage sendPushMessage);

    // 푸시 메시지 발송 결과 조회
    @GET("message")
    Call<MessageResultResponse> getResultPushMessage(
            @Query("version") String version,
            @Query("result_type") String result_type,
            @Query("register_code") String register_code,
            @Query("uid") String uid,
            @Query("from") String from,
            @Query("to") String to,
            @Query("date") String date
    );

    // 어린이집 - 전표 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip/{requestType}/user/{userId}")
    Call<WorkRegisterResponse> registerSlipUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipUpload slipUpload
    );

    // 어린이집 - 전표 CIS 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-cis/{requestType}/user/{userId}")
    Call<WorkRegisterResponse> registerSlipCisSend(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipCisSend slipCisSend
    );

    // 어린이집 - 전표 분할 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-split/{requestType}/user/{userId}")
    Call<WorkRegisterResponse> registerSlipSplitUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipSplitUpload slipSplitUpload
    );

    // 어린이집 - 예산 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget/{requestType}/user/{userId}")
    Call<WorkRegisterResponse> registerBudgetUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body BudgetUpload budgetUpload
    );

    // 어린이집 - 예산 CIS 등록
    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget-cis/{requestType}/user/{userId}")
    Call<WorkRegisterResponse> registerBudgetCisSend(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body BudgetCisSend budgetCisSend
    );

    // W4C - 데이터 등록
    @POST("w4c/jangbu/{jangbuId}/service/{serviceCode}/slip/user/{userId}")
    Call<WorkRegisterResponse> registerW4cSlipUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("userId") String userId,
            @Body W4cSlipUpload w4cSlipUpload
    );

    // W4C - 월간 데이터 등록
    @POST("w4c/jangbu/{jangbuId}/service/{serviceCode}/slip-monthly/user/{userId}")
    Call<WorkRegisterResponse> registerW4cSlipUploadMonthly(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("userId") String userId,
            @Body W4cSlipUploadMonthly w4cSlipUploadMonthly
    );

    // EDI - 데이터 등록
    @POST("edi/jangbu/{jangbuId}/service/{serviceCode}/{requestType}/user/{userId}")
    Call<WorkRegisterResponse> registerEdi(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body Edi edi
    );

    // 음식배달 - 데이터 등록
    @POST("delivery/jangbu/{jangbuId}/service/{serviceCode}/user/{userId}")
    Call<WorkRegisterResponse> registerDelivery(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("userId") String userId,
            @Body Delivery delivery
    );

    // 업무내역 - 등록 상태 조회
    @GET("jangbu/{jangbuId}/status/{registerCode}")
    Call<WorkStatusResponse> getWorkStatus(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("registerCode") String registerCode,
            @Query("version") String version
    );

    // 업무내역 - 등록 결과 조회
    @GET("jangbu/{jangbuId}/status/{registerCode}")
    Call<WorkResultResponse> getWorkResult(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("registerCode") String registerCode,
            @Query("version") String version
    );

    // 업무내역 - 전표/증빙자료 조회
    @GET("jangbu/{jangbuId}/service/{serviceCode}/user/{userId}/voucher")
    Call<WorkVoucherResponse> getVoucher(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("userId") String userId,
            @Query("version") String version,
            @Query("yearmonth") String yearmonth
    );
}
