package study.ksi.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import study.ksi.dto.KISTokenResponse;
import study.ksi.dto.KsiRequestDto;

@Service
public class KsiService {
    private final RestTemplate restTemplate = new RestTemplate();

    public String getAccessToken(String appKey, String appSecret) {
        String url = "https://openapi.koreainvestment.com:9443/oauth2/tokenP"; // 모의투자용

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        KsiRequestDto tokenRequest = new KsiRequestDto();
        tokenRequest.setAppkey(appKey);
        tokenRequest.setAppsecret(appSecret);

        HttpEntity<KsiRequestDto> entity = new HttpEntity<>(tokenRequest, headers);

        ResponseEntity<KISTokenResponse> response =
                restTemplate.postForEntity(url, entity, KISTokenResponse.class);

        return response.getBody().getAccess_token();
    }
}
