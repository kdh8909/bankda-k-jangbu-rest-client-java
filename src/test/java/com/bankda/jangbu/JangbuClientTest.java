package com.bankda.jangbu;

import com.bankda.jangbu.exception.BankdaException;
import com.bankda.jangbu.request.Auth;
import com.bankda.jangbu.request.kindergarten.SlipUpload;
import com.bankda.jangbu.request.kindergarten.SlipUploadData;
import com.bankda.jangbu.response.AuthResponse;
import com.bankda.jangbu.response.RegisterResponse;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class JangbuClientTest {
    JangbuClient client;
    String accessToken;
    String refreshToken;
    String jangbuId = null;
    String password = null;
    String userId = null;

    @Before
    public void before() {
        try {
            client = new JangbuClient();
            AuthResponse authResponse = client.createToken(new Auth("2.00", "jangbu", jangbuId, password));
            accessToken = authResponse.getAccess_token();
            refreshToken = authResponse.getRefresh_token();
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 토큰 발급
     */
    @Test
    public void testCreateToken() {
        try {
            Auth auth = new Auth("2.00", "jangbu", jangbuId, password );
            AuthResponse authResponse = client.createToken(auth);
            assertEquals(200, authResponse.getReturn_code());
            assertNotNull(authResponse.getAccess_token());
            assertNotNull(authResponse.getRefresh_token());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 어린이집 전표 등록
     */
    @Test
    public void testRegisterSlipUpload() {
        try {
            ArrayList<SlipUploadData> slipUploadDataArrayList = new ArrayList<>();
            SlipUploadData slipUploadData = new SlipUploadData("20210604",
                    "20210609",
                    "20210609",
                    "221-113",
                    "I",
                    "메모내용",
                    "비고내용",
                    "N",
                    "N",
                    "I",
                    "150000",
                    "150000",
                    "0",
                    "1500000",
                    "거래내용(적요)",
                    "100"
            );
            slipUploadDataArrayList.add(slipUploadData);
            SlipUpload slipUpload = new SlipUpload(
                    "2.00",
                    "slip_delete_upload",
                    userId,
                    "경기형",
                    "20190709122034",
                    "경기형 slip_delete_upload",
                    "1",
                    slipUploadDataArrayList
            );
            RegisterResponse registerResponse = client.registerSlipUpload(
                    accessToken,
                    jangbuId,
                    "GYEONGGI",
                    "slip_delete_upload",
                    userId,
                    slipUpload
            );
            assertEquals(200, registerResponse.getReturn_code());
            assertEquals("정상", registerResponse.getDescription());
            assertNotNull(registerResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            //서버 연결 실패
            e.printStackTrace();
        }
    }
}
