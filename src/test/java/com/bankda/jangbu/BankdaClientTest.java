package com.bankda.jangbu;

import com.bankda.jangbu.exception.BankdaException;
import com.bankda.jangbu.request.auth.CreateToken;
import com.bankda.jangbu.request.auth.RefreshToken;
import com.bankda.jangbu.request.delivery.Delivery;
import com.bankda.jangbu.request.delivery.DeliveryData;
import com.bankda.jangbu.request.edi.Edi;
import com.bankda.jangbu.request.edi.EdiData;
import com.bankda.jangbu.request.kindergarten.*;
import com.bankda.jangbu.request.w4c.W4cSlipUpload;
import com.bankda.jangbu.request.w4c.W4cSlipUploadData;
import com.bankda.jangbu.request.w4c.W4cSlipUploadMonthly;
import com.bankda.jangbu.response.auth.AuthResponse;
import com.bankda.jangbu.response.work.WorkRegisterResponse;
import com.bankda.jangbu.response.work.WorkResultResponse;
import com.bankda.jangbu.response.work.WorkStatusResponse;
import com.bankda.jangbu.response.work.WorkVoucherResponse;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BankdaClientTest {
    public static BankdaClient client = new BankdaClient();

    private static String version = "3.00";
    private static String jangbuUserType = "jangbu";
    private static String kinderJangbuId = "wisearn";
    private static String w4cJangbuId = "knet";
    private static String ediJangbuId = "wisearn";
    private static String deliveryJangbuId = "owra";
    private static String kinderUserId = "7208001390";
    private static String w4cUserId = "1348033785";
    private static String ediUserId = "1678500163";
    private static String deliveryUserId = "owrauser";
    private static String password = "1234";
    private static String kinderRegisterCode = null;

    @BeforeAll
    public static void beforeClass() {
        try {
            AuthResponse authResponse = client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("?????? ??????")
    @Test
    @Order(1)
    public void testCreateToken() {
        try {
            CreateToken createToken = new CreateToken(version, jangbuUserType, kinderJangbuId, password);
            AuthResponse authResponse = client.createToken(createToken);
            assertEquals(200, authResponse.getReturn_code());
            assertNotNull(authResponse.getAccess_token());
            assertNotNull(authResponse.getRefresh_token());
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("?????? ?????????")
    @Test
    @Order(1)
    public void testRefreshToken() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            RefreshToken createToken = new RefreshToken(version, BankdaClient.getRefreshToken());
            AuthResponse authResponse = client.refreshToken(createToken);
            assertEquals(200, authResponse.getReturn_code());
            assertNotNull(authResponse.getAccess_token());
            assertNotNull(authResponse.getRefresh_token());
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("???????????? - ?????? ??????")
    @Test
    @Order(2)
    public void testRegisterSlipUpload() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            List<SlipUploadData> slipUploadDataList = new ArrayList<>();
            SlipUploadData slipUploadData = new SlipUploadData("20210604",
                    "20210609",
                    "20210609",
                    "221-113",
                    "I",
                    "????????????",
                    "????????????",
                    "N",
                    "N",
                    "I",
                    "150000",
                    "150000",
                    "0",
                    "1500000",
                    "????????????(??????)",
                    "100"
            );
            slipUploadDataList.add(slipUploadData);

            SlipUpload slipUpload = new SlipUpload(
                    "2.00",
                    "slip_delete_upload",
                    kinderUserId,
                    "?????????",
                    "20190709122034",
                    "????????? slip_delete_upload",
                    "1",
                    slipUploadDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerSlipUpload(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    "GYEONGGI",
                    "slip_delete_upload",
                    kinderUserId,
                    slipUpload
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
            kinderRegisterCode = workRegisterResponse.getRegister_code();
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("???????????? - ?????? CIS ??????")
    @Test
    @Order(3)
    public void testRegisterSlipCisSend() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            List<SlipCisSendData> slipCisSendDataList = new ArrayList<>();
            slipCisSendDataList.add(new SlipCisSendData("202104"));
            slipCisSendDataList.add(new SlipCisSendData("202105"));
            SlipCisSend slipCisSend = new SlipCisSend(
                    "2.00",
                    "slip_cis_send",
                    kinderUserId,
                    "?????????",
                    "20210723161600",
                    "????????? slip_cis_send",
                    "2",
                    slipCisSendDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerSlipCisSend(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    "GYEONGGI",
                    "slip_cis_send",
                    kinderUserId,
                    slipCisSend
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("???????????? - ?????? ?????? ??????")
    @Test
    @Order(4)
    public void testRegisterSlipSplitUpload() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            List<SlipSplitUploadData> slipSplitUploadDataList = new ArrayList<>();
            List<SlipSplitUploadSlip> slipSplitUploadSlipList = new ArrayList<>();
            SlipSplitUploadBank slipSplitUploadBank = new SlipSplitUploadBank(
                    "20210405",
                    "20210405",
                    "I",
                    "150000",
                    "150000",
                    "0",
                    "150000",
                    "????????????(??????)"
            );
            slipSplitUploadSlipList.add(new SlipSplitUploadSlip(
                    "20210405",
                    "20210405",
                    "211",
                    "I",
                    "150000",
                    "????????????",
                    "????????????",
                    "N",
                    "Y",
                    "600"
            ));

            SlipSplitUploadData slipSplitUploadData = new SlipSplitUploadData();
            slipSplitUploadData.setSlip(slipSplitUploadSlipList);
            slipSplitUploadData.setBank(slipSplitUploadBank);
            slipSplitUploadDataList.add(slipSplitUploadData);

            SlipSplitUpload slipSplitUpload = new SlipSplitUpload(
                    "2.00",
                    "slip_split_delete_upload",
                    kinderUserId,
                    "?????????",
                    "20210723161600",
                    "????????? slip_split_delete_upload",
                    "1",
                    slipSplitUploadDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerSlipSplitUpload(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    "GYEONGGI",
                    "slip_split_delete_upload",
                    kinderUserId,
                    slipSplitUpload
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("???????????? - ?????? ??????")
    @Test
    @Order(5)
    public void testRegisterBudgetUpload() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));

            List<BudgetUploadData> budgetUploadDataList = new ArrayList<BudgetUploadData>();
            List<BudgetUploadItem> budgetUploadItems = new ArrayList<BudgetUploadItem>();
            BudgetUploadItem budgetUploadItem1 = new BudgetUploadItem();
            budgetUploadItem1.setESTI_OUT_NAME("???3???");
            budgetUploadItem1.setESTI_OUT_MONEY("353000");
            budgetUploadItem1.setESTI_OUT_BASICNUM1("5");
            budgetUploadItem1.setESTI_OUT_BASICTEXT1("???");
            budgetUploadItem1.setESTI_OUT_BASICNUM2("12");
            budgetUploadItem1.setESTI_OUT_BASICTEXT2("??????");
            budgetUploadItem1.setESTI_OUT_TOTMONEY("21180000");

            BudgetUploadItem budgetUploadItem2 = new BudgetUploadItem();
            budgetUploadItem2.setESTI_OUT_NAME("???1???");
            budgetUploadItem2.setESTI_OUT_MONEY("484000");
            budgetUploadItem2.setESTI_OUT_BASICNUM1("6");
            budgetUploadItem2.setESTI_OUT_BASICTEXT1("???");
            budgetUploadItem2.setESTI_OUT_BASICNUM2("12");
            budgetUploadItem2.setESTI_OUT_BASICTEXT2("??????");
            budgetUploadItem2.setESTI_OUT_TOTMONEY("34848000");

            BudgetUploadItem budgetUploadItem3 = new BudgetUploadItem();
            budgetUploadItem3.setESTI_OUT_NAME("???2???");
            budgetUploadItem3.setESTI_OUT_MONEY("426000");
            budgetUploadItem3.setESTI_OUT_BASICNUM1("10");
            budgetUploadItem3.setESTI_OUT_BASICTEXT1("???");
            budgetUploadItem3.setESTI_OUT_BASICNUM2("12");
            budgetUploadItem3.setESTI_OUT_BASICTEXT2("??????");
            budgetUploadItem3.setESTI_OUT_TOTMONEY("51120000");

            budgetUploadItems.add(budgetUploadItem1);
            budgetUploadItems.add(budgetUploadItem2);
            budgetUploadItems.add(budgetUploadItem3);

            BudgetUploadData budgetUploadData = new BudgetUploadData();
            budgetUploadData.setESTI_DISPLAY("111");
            budgetUploadData.setESTI_INOUT("I");
            budgetUploadData.setTOTAL_MONEY("107148000");
            budgetUploadData.setBudget_item(budgetUploadItems);

            budgetUploadDataList.add(budgetUploadData);

            BudgetUpload budgetUpload = new BudgetUpload(
                    "2.00",
                    "budget_delete_upload",
                    kinderUserId,
                    "?????????",
                    "20210723161600",
                    "????????? budget_delete_upload",
                    "1",
                    "2021",
                    "?????????",
                    budgetUploadDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerBudgetUpload(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    "GYEONGGI",
                    "budget_delete_upload",
                    kinderUserId,
                    budgetUpload
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("???????????? - ?????? CIS ??????")
    @Test
    @Order(6)
    public void testRegisterBudgetCisSend() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            List<BudgetCisSendData> budgetCisSendDataList = new ArrayList<>();
            budgetCisSendDataList.add(new BudgetCisSendData("2021", "?????????"));
            BudgetCisSend budgetCisSend = new BudgetCisSend(
                    "2.00",
                    "budget_cis_send",
                    kinderUserId,
                    "?????????",
                    "20210723161600",
                    "????????? budget_cis_send",
                    "1",
                    budgetCisSendDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerBudgetCisSend(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    "GYEONGGI",
                    "budget_cis_send",
                    kinderUserId,
                    budgetCisSend
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("W4C ????????? ??????")
    @Test
    @Order(7)
    public void testRegisterW4cSlipUpload() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, w4cJangbuId, password));
            List<W4cSlipUploadData> w4cSlipUploadDataList = new ArrayList<>();
            w4cSlipUploadDataList.add(new W4cSlipUploadData(
                "20210501",
                "?????????",
                "???????????????",
                "0",
                "70000",
                "?????????????????????",
                "????????????",
                "??????IC?????????",
                "???????????????",
                "123456789010",
                "????????????"
            ));
            W4cSlipUpload w4cSlipUpload = new W4cSlipUpload(
                    "2.00",
                    "slip_upload",
                    w4cUserId,
                    "w4c",
                    "S1234",
                    "20210723161600",
                    "w4c slip_upload",
                    "1",
                    w4cSlipUploadDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerW4cSlipUpload(
                    BankdaClient.getAccessToken(),
                    w4cJangbuId,
                    "W4C",
                    w4cUserId,
                    w4cSlipUpload
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("W4C ?????? ????????? ??????")
    @Test
    @Order(8)
    public void testRegisterW4cSlipUploadMonthly() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, w4cJangbuId, password));
            List<W4cSlipUploadData> w4cSlipUploadDataList = new ArrayList<>();
            w4cSlipUploadDataList.add(new W4cSlipUploadData(
                    "20210501",
                    "?????????",
                    "???????????????",
                    "0",
                    "70000",
                    "?????????????????????",
                    "????????????",
                    "??????IC?????????",
                    "???????????????",
                    "123456789010",
                    "????????????"
            ));
            W4cSlipUploadMonthly w4cSlipUploadMonthly = new W4cSlipUploadMonthly(
                    "2.00",
                    "slip_upload_monthly",
                    w4cUserId,
                    "w4c",
                    "S1234",
                    "20210723161600",
                    "w4c slip_upload_monthly",
                    "1",
                    w4cSlipUploadDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerW4cSlipUploadMonthly(
                    BankdaClient.getAccessToken(),
                    w4cJangbuId,
                    "W4C",
                    w4cUserId,
                    w4cSlipUploadMonthly
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("EDI ????????? ??????")
    @Test
    @Order(9)
    public void testRegisterEdi() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, ediJangbuId, password));
            List<EdiData> ediDataList = new ArrayList<>();
            ediDataList.add(new EdiData(
                    "1234567890",
                    "202106"
            ));
            Edi edi = new Edi(
                    "2.00",
                    "all",
                    ediUserId,
                    "EDI",
                    "20210723161600",
                    "EDI all",
                    "1",
                    ediDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerEdi(
                    BankdaClient.getAccessToken(),
                    ediJangbuId,
                    "EDI",
                    "all",
                    ediUserId,
                    edi
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("???????????? ????????? ??????")
    @Test
    @Order(10)
    public void testRegisterDelivery() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, deliveryJangbuId, password));
            List<DeliveryData> deliveryDataList = new ArrayList<>();
            deliveryDataList.add(new DeliveryData(
                    "userid",
                    "password",
                    "20210331",
                    "20210401",
                    "1234567890"
            ));
            Delivery delivery = new Delivery(
                    "2.00",
                    "food_delivery",
                    deliveryUserId,
                    "????????????",
                    "yogiyo",
                    "20210614122034",
                    "???????????? food_delivery",
                    "1",
                    deliveryDataList
            );
            WorkRegisterResponse workRegisterResponse = client.registerDelivery(
                    BankdaClient.getAccessToken(),
                    deliveryJangbuId,
                    "FOOD_DELIVERY",
                    deliveryUserId,
                    delivery
            );
            assertEquals(200, workRegisterResponse.getReturn_code());
            assertEquals("??????", workRegisterResponse.getDescription());
            assertNotNull(workRegisterResponse.getRegister_code());
        } catch (BankdaException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("?????? ?????? ??????")
    @Test
    @Order(11)
    public void testGetWorkStatus() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            WorkStatusResponse workStatusResponse = client.getWorkStatus(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    kinderRegisterCode,
                    version
            );
            assertEquals(200, workStatusResponse.getReturn_code());
            assertEquals("??????", workStatusResponse.getDescription());
            assertEquals("??????", workStatusResponse.getStatus());
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("?????? ?????? ??????")
    @Test
    @Order(12)
    public void testGetWorkResult() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            WorkResultResponse workResultResponse = client.getWorkResult(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    kinderRegisterCode,
                    version
            );
            assertEquals(200, workResultResponse.getReturn_code());
            assertEquals("??????", workResultResponse.getDescription());
            assertEquals("??????", workResultResponse.getStatus());
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @DisplayName("??????/???????????? ??????")
    @Test
    @Order(13)
    public void testGetVoucher() {
        try {
            client.createToken(new CreateToken(version, jangbuUserType, kinderJangbuId, password));
            WorkVoucherResponse workVoucherResponse = client.getVoucher(
                    BankdaClient.getAccessToken(),
                    kinderJangbuId,
                    "GYEONGGI",
                    kinderUserId,
                    version,
                    "202106"
            );
            assertEquals(200, workVoucherResponse.getReturn_code());
            assertEquals("??????", workVoucherResponse.getDescription());
            assertNotNull(workVoucherResponse.getData());
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
