package com.bankda.jangbu;

import com.bankda.jangbu.exception.BankdaException;
import com.bankda.jangbu.request.Auth;
import com.bankda.jangbu.request.kindergarten.SlipCisSend;
import com.bankda.jangbu.request.kindergarten.SlipUpload;
import com.bankda.jangbu.response.AuthResponse;
import com.bankda.jangbu.response.RegisterResponse;
import com.google.gson.*;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.HttpException;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class JangbuClient {

    public static final String API_URL = "http://localhost:3002/jangbu/api/";
    private Jangbu jangbu = null;
    private static String accessToken = null;
    private static String refreshToken = null;

    public JangbuClient() {
        this.jangbu = this.create();
    }

    public JangbuClient(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.jangbu = this.create();
    }

    /**
     * 토큰 발급
     * @param auth
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public AuthResponse createToken(Auth auth) throws BankdaException, IOException {
        Call<AuthResponse> call = this.jangbu.createToken(auth);
        Response<AuthResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        accessToken = response.body().getAccess_token();
        refreshToken = response.body().getRefresh_token();

        return response.body();
    }

    /**
     * 어린이집 전표 등록
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI, 인천형: INCHEON, 대구형: DAEGU, 서울형: SEOUL)
     * @param requestType: 요청 타입 (slip_upload, slip_delete_upload, slip_bill_upload, slip_bill_delete_upload)
     * @param userId: 사용자 ID
     * @param slipUpload: 업무 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public RegisterResponse registerSlipUpload(String token, String jangbuId, String serviceCode, String requestType, String userId, SlipUpload slipUpload) throws BankdaException, IOException {
        Call<RegisterResponse> call = this.jangbu.registerSlipUpload("Bearer " + token, jangbuId, serviceCode, requestType, userId, slipUpload);
        Response<RegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 어린이집 전표 CIS 등록
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI, 인천형: INCHEON, 대구형: DAEGU, 서울형: SEOUL)
     * @param requestType: 요청 타입 (slip_cis_send)
     * @param userId: 사용자 ID
     * @param slipCisSend: 업무 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public RegisterResponse registerSlipCisSend(String token, String jangbuId, String serviceCode, String requestType, String userId, SlipCisSend slipCisSend) throws BankdaException, IOException {
        Call<RegisterResponse> call = this.jangbu.registerSlipCisSend("Bearer " + token, jangbuId, serviceCode, requestType, userId, slipCisSend);
        Response<RegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    protected Jangbu create() {
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(10, TimeUnit.SECONDS)
                .addInterceptor(new Interceptor() {
                    public okhttp3.Response intercept(Chain chain) throws IOException {
                        Request request = chain.request();
                        return chain.proceed(request);
                    }
                })
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();

        return retrofit.create(Jangbu.class);
    }

    private String getExceptionMessage(Response<?> response) {
        String error = null;
        try {
            JsonElement element = new JsonParser().parse(response.errorBody().string());
            error = element.getAsJsonObject().get("message").getAsString();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if ( error == null )    error = response.message();
        return error;
    }
}
