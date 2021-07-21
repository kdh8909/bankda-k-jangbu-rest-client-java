package com.bankda.jangbu;

import com.bankda.jangbu.request.Auth;
import com.bankda.jangbu.request.kindergarten.SlipUpload;
import com.bankda.jangbu.response.AuthResponse;
import com.bankda.jangbu.response.RegisterResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Jangbu {
    @POST("auth")
    Call<AuthResponse> createToken(@Body Auth auth);

    @POST("kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip/{requestType}/user/{userId}")
    Call<RegisterResponse> registerSlipUpload(
            @Header("Authorization") String token,
            @Path("jangbuId") String jangbuId,
            @Path("serviceCode") String serviceCode,
            @Path("requestType") String requestType,
            @Path("userId") String userId,
            @Body SlipUpload slipUpload
    );
}
