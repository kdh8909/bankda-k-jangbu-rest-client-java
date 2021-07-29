# 뱅크다K 장부사 API 클라이언트 (Java)

## 설치

- pom.xml

1. JitPack Repository 추가
```xml
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>
```
2. dependency 추가
```xml
<dependency>
    <groupId>com.github.kdh8909</groupId>
    <artifactId>bankda-k-jangbu-rest-client-java</artifactId>
    <version>0.0.4</version>
</dependency>
```

## API 목록

### Path Prefix: /jangbu/api

### 인증

- 토큰 발급 : `POST` /createToken
- 토큰 갱신 : `PUT` /createToken

### 회원

- 고객 회원 등록 : `POST` /user

### 푸시 메시지

- 푸시 메시지 발송 요청 : `POST` /message
- 푸시 메시지 발송 결과 조회 : `GET` /message

### 어린이집

- 전표 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-split/{requestType}/user/{userId}
- 전표 CIS 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-cis/{requestType}/user/{userId}
- 전표 분할 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-split/{requestType}/user/{userId}
- 예산 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget/{requestType}/user/{userId}
- 예산 CIS 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget-cis/{requestType}/user/{userId}

### W4C

- 데이터 등록 : `POST` /w4c/jangbu/{jangbuId}/service/{serviceCode}/slip/user/{userId}
- 월간 데이터 등록 : `POST` /w4c/jangbu/{jangbuId}/service/{serviceCode}/slip-monthly/user/{userId}

### EDI 

- 데이터 등록 : `POST` /edi/jangbu/{jid}/service/{serviceCode}/{requestType}/user/{userId}

### 어린이집

- 데이터 등록 : `POST` /delivery/jangbu/{jid}/service/{serviceCode}/user/{userId}

### 업무내역

- 등록 상태 조회 : `GET` /jangbu/{jid}/status/{code}
- 등록 결과 조회 : `GET` /jangbu/{jid}/result/{code}
- 전표/증빙자료 조회 : `GET` /jangbu/{jid}/service/{serviceCode}/user/{userId}/voucher

## 예제

### 인스턴스 생성
    ```java
    public static BankdaClient bankdaClient = new BankdaClient();
    ```
### 인증
- AccessToken
    ```java
    BankdaClient.getAccessToken();
    ```
- RefreshToken
    ```java
    BankdaClient.getRefreshToken();
    ```
- 토큰 발급
    ```java
    CreateToken createToken = new CreateToken(version, jangbuUserType, kinderJangbuId, password);
    AuthResponse authResponse = bankdaClient.createToken(createToken);
    ```
- 토큰 재발급
    ```java
    
    ```
### 어린이집

- 전표 등록
    ```java
    WorkRegisterResponse workRegisterResponse = bankdaClient.registerSlipUpload(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "GYEONGGI", // 서비스 코드
                    "slip_delete_upload", // 요청 타입
                    userId, // 회원 ID
                    slipUpload // 전표 등록 데이터
                );
    ```

- 전표 CIS 등록
    ```java
    WorkRegisterResponse workRegisterResponse = client.registerSlipCisSend(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "GYEONGGI", // 서비스 코드
                    "slip_cis_send", // 요청 타입
                    userId, // 회원 ID
                    slipCisSend // 전표 CIS 등록 데이터
                );
    ```

- 전표 분할 등록
    ```java
    WorkRegisterResponse workRegisterResponse = client.registerSlipSplitUpload(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "GYEONGGI", // 서비스 코드
                    "slip_split_delete_upload", // 요청 타입
                    userId, // 회원 ID
                    slipSplitUpload // 전표 분할 등록 데이터
                );
    ```
  
- 예산 등록
    ```java
    WorkRegisterResponse workRegisterResponse = client.registerBudgetUpload(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "GYEONGGI", // 서비스 코드
                    "budget_delete_upload", // 요청 타입
                    userId, // 회원 ID
                    budgetUpload // 예산 등록 데이터
                );
    ```

- 예산 CIS 등록
    ```java
    WorkRegisterResponse workRegisterResponse = client.registerBudgetCisSend(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "GYEONGGI", // 서비스 코드
                    "budget_cis_send", // 요청 타입
                    userId, // 회원 ID
                    budgetCisSend // 예산 CIS 등록 데이터
                );
    ```
  
### W4C

- 데이터 등록

    ```java
    WorkRegisterResponse workRegisterResponse = client.registerW4cSlipUpload(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "W4C", // 서비스 코드
                    userId, // 회원 ID
                    w4cSlipUpload // W4C 등록 데이터
                );
    ```
  
- 월간 데이터 등록

    ```java
    WorkRegisterResponse workRegisterResponse = client.registerW4cSlipUploadMonthly(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "W4C", // 서비스 코드
                    userId, // 회원 ID
                    w4cSlipUploadMonthly // W4C 등록 월간 데이터
                );
    ```
  
### EDI

- 데이터 등록

    ```java
    WorkRegisterResponse workRegisterResponse = client.registerEdi(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "EDI", // 서비스 코드
                    "all", // 요청 타입
                    userId, // 회원 ID
                    edi // EDI 등록 데이터
                );
    ```

### 음식배달

- 데이터 등록

    ```java
    WorkRegisterResponse workRegisterResponse = client.registerDelivery(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "FOOD_DELIVERY", // 서비스 코드
                    userId, // 회원 ID
                    delivery // 음식배달 등록 데이터
                );
    ```
  
### 업무내역

- 등록 상태 조회

    ```java
    WorkStatusResponse workStatusResponse = client.getWorkStatus(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    registerCode, // 등록 코드 
                    version // API 버전
                );
    ```

- 등록 결과 조회

    ```java
    WorkResultResponse workResultResponse = client.getWorkResult(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    registerCode, // 등록 코드
                    version // API 버전
                );
    ```

- 전표/증빙자료 조회

    ```java
    WorkVoucherResponse workVoucherResponse = client.getVoucher(
                    BankdaClient.getAccessToken(), // Access Token
                    jangbuId, // 장부사 ID
                    "GYEONGGI", // 서비스 코드
                    userId, // 회원 ID
                    version, // API 버전
                    "202106" // 등록연월
                );
    ```