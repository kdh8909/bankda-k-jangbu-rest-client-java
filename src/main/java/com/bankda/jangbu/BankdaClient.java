package com.bankda.jangbu;

import com.bankda.jangbu.exception.BankdaException;
import com.bankda.jangbu.request.auth.CreateToken;
import com.bankda.jangbu.request.delivery.Delivery;
import com.bankda.jangbu.request.edi.Edi;
import com.bankda.jangbu.request.kindergarten.*;
import com.bankda.jangbu.request.w4c.W4cSlipUpload;
import com.bankda.jangbu.request.w4c.W4cSlipUploadMonthly;
import com.bankda.jangbu.response.auth.AuthResponse;
import com.bankda.jangbu.response.work.WorkRegisterResponse;
import com.bankda.jangbu.response.work.WorkResultResponse;
import com.bankda.jangbu.response.work.WorkStatusResponse;
import com.bankda.jangbu.response.work.WorkVoucherResponse;
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

public class BankdaClient {

    public static final String API_URL = "http://localhost:3002/jangbu/api/";
    private Bankda bankda = null;
    private static String accessToken = null;
    private static String refreshToken = null;

    public static String getAccessToken() {
        return accessToken;
    }

    public static String getRefreshToken() {
        return refreshToken;
    }

    public BankdaClient() {
        this.bankda = this.create();
    }

    public BankdaClient(String accessToken, String refreshToken) {
        this.accessToken = accessToken;
        this.refreshToken = refreshToken;
        this.bankda = this.create();
    }

    /**
     * 토큰 발급
     * @param createToken
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public AuthResponse createToken(CreateToken createToken) throws BankdaException, IOException {
        Call<AuthResponse> call = this.bankda.createToken(createToken);
        Response<AuthResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        accessToken = response.body().getAccess_token();
        refreshToken = response.body().getRefresh_token();

        return response.body();
    }

    /**
     * 어린이집 전표 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI, 인천형: INCHEON, 대구형: DAEGU, 서울형: SEOUL)
     * @param requestType: 요청 타입 (slip_upload, slip_delete_upload, slip_bill_upload, slip_bill_delete_upload)
     * @param userId: 사용자 ID
     * @param slipUpload: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerSlipUpload(String token, String jangbuId, String serviceCode, String requestType, String userId, SlipUpload slipUpload) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerSlipUpload("Bearer " + token, jangbuId, serviceCode, requestType, userId, slipUpload);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 어린이집 전표 CIS 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI, 인천형: INCHEON, 대구형: DAEGU, 서울형: SEOUL)
     * @param requestType: 요청 타입 (slip_cis_send)
     * @param userId: 사용자 ID
     * @param slipCisSend: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerSlipCisSend(String token, String jangbuId, String serviceCode, String requestType, String userId, SlipCisSend slipCisSend) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerSlipCisSend("Bearer " + token, jangbuId, serviceCode, requestType, userId, slipCisSend);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 어린이집 전표 분할 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI)
     * @param requestType: 요청 타입 (slip_split_delete_upload)
     * @param userId: 사용자 ID
     * @param slipSplitUpload: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerSlipSplitUpload(String token, String jangbuId, String serviceCode, String requestType, String userId, SlipSplitUpload slipSplitUpload) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerSlipSplitUpload("Bearer " + token, jangbuId, serviceCode, requestType, userId, slipSplitUpload);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 어린이집 예산 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI, 인천형: INCHEON, 대구형: DAEGU, 서울형: SEOUL)
     * @param requestType: 요청 타입 (budget_upload)
     * @param userId: 사용자 ID
     * @param budgetUpload: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerBudgetUpload(String token, String jangbuId, String serviceCode, String requestType, String userId, BudgetUpload budgetUpload) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerBudgetUpload("Bearer " + token, jangbuId, serviceCode, requestType, userId, budgetUpload);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 어린이집 예산 CIS 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (경기형 : GYEONGGI, 인천형: INCHEON, 대구형: DAEGU)
     * @param requestType: 요청 타입 (budget_cis_send)
     * @param userId: 사용자 ID
     * @param budgetCisSend: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerBudgetCisSend(String token, String jangbuId, String serviceCode, String requestType, String userId, BudgetCisSend budgetCisSend) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerBudgetCisSend("Bearer " + token, jangbuId, serviceCode, requestType, userId, budgetCisSend);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * W4C 데이터 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (w4c)
     * @param userId: 사용자 ID
     * @param w4cSlipUpload: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerW4cSlipUpload(String token, String jangbuId, String serviceCode, String userId, W4cSlipUpload w4cSlipUpload) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerW4cSlipUpload("Bearer " + token, jangbuId, serviceCode, userId, w4cSlipUpload);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * W4C 월간 데이터 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (w4c)
     * @param userId: 사용자 ID
     * @param w4cSlipUploadMonthly: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerW4cSlipUploadMonthly(String token, String jangbuId, String serviceCode, String userId, W4cSlipUploadMonthly w4cSlipUploadMonthly) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerW4cSlipUploadMonthly("Bearer " + token, jangbuId, serviceCode, userId, w4cSlipUploadMonthly);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * EDI 데이터 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (EDI)
     * @param requestType: 요청 타입 (전부: all, 건강보험: health, 국민연금: pension, 고용산재: employment)
     * @param userId: 사용자 ID
     * @param edi: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerEdi(String token, String jangbuId, String serviceCode, String requestType, String userId, Edi edi) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerEdi("Bearer " + token, jangbuId, serviceCode, requestType, userId, edi);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 음식배달 데이터 등록
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 이름 (음식배달)
     * @param userId: 사용자 ID
     * @param delivery: 데이터
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkRegisterResponse registerDelivery(String token, String jangbuId, String serviceCode, String userId, Delivery delivery) throws BankdaException, IOException {
        Call<WorkRegisterResponse> call = this.bankda.registerDelivery("Bearer " + token, jangbuId, serviceCode, userId, delivery);
        Response<WorkRegisterResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 등록 상태 조회
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param registerCode: 등록 코드
     * @param version: API 버전
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkStatusResponse getWorkStatus(String token, String jangbuId, String registerCode, String version) throws BankdaException, IOException {
        Call<WorkStatusResponse> call = this.bankda.getWorkStatus("Bearer " + token, jangbuId, registerCode, version);
        Response<WorkStatusResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 등록 결과 조회
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param registerCode: 등록 코드
     * @param version: API 버전
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkResultResponse getWorkResult(String token, String jangbuId, String registerCode, String version) throws BankdaException, IOException {
        Call<WorkResultResponse> call = this.bankda.getWorkResult("Bearer " + token, jangbuId, registerCode, version);
        Response<WorkResultResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }

    /**
     * 전표/증빙자료 조회
     * @param token: Access Token
     * @param jangbuId: 장부사 ID
     * @param serviceCode: 서비스 코드(경기형: GYEONGGI, 인천형: INCHEON, 대구형: DAEGU, 서울형: SEOUL)
     * @param userId: 사용자 ID
     * @param version: API 버전
     * @param yearMonth: 조회연월 (YYYYMM)
     * @return
     * @throws BankdaException
     * @throws IOException
     */
    public WorkVoucherResponse getVoucher(String token, String jangbuId, String serviceCode, String userId, String version, String yearMonth) throws BankdaException, IOException {
        Call<WorkVoucherResponse> call = this.bankda.getVoucher("Bearer " + token, jangbuId, serviceCode, userId, version, yearMonth);
        Response<WorkVoucherResponse> response = call.execute();

        if ( !response.isSuccessful() )	throw new BankdaException( getExceptionMessage(response), new HttpException(response) );
        return response.body();
    }


    protected Bankda create() {
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

        return retrofit.create(Bankda.class);
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
