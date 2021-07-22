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

- 토큰 발급 : `POST` /auth

### 어린이집

- 전표 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-split/{requestType}/user/{userId}
- 전표 CIS 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-cis/{requestType}/user/{userId}
- 전표 분할 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/slip-split/{requestType}/user/{userId}
- 예산 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget/{requestType}/user/{userId}
- 예산 CIS 등록 : `POST` /kindergarten/jangbu/{jangbuId}/service/{serviceCode}/budget-cis/{requestType}/user/{userId}

### W4C

- 데이터 등록 : `POST` /w4c/jangbu/{jangbuId}/service/{serviceCode}/slip/user/{userId}
- 월간 데이터 등록 : `POST` /w4c/jangbu/{jangbuId}/service/{serviceCode}/slip-monthly/user/{userId}

## 예제

- 토큰 발급
```java
public class BankdaController {
    public static accessToken = null;
    public static refreshToken = null;
    public static JangbuClient jangbuClient = new JangbuClient();
    
    @PostMapping("/auth")
    public AuthResponse createToken(@RequestBody Auth auth) {
        AuthResponse authResponse = null;
        try {
            authResponse = jangbuClient.createToken(auth);
            accessToken = authResponse.getAccess_token();
            refreshToken = authResponse.getRefresh_token();
        } catch (BankdaException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return authResponse;
    }
}
```
- 토큰 사용 
```java
    public String getAccessToken() {
        return JangbuClient.getAccessToken();
    }

    public String getRefreshToken() {
        return JangbuClient.getRefreshToken();
    }
```

- 전표 등록
```java

```