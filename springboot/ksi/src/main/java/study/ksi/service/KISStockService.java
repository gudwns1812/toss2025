package study.ksi.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import study.ksi.dto.IndexCategoryResponse;

@Service
public class KISStockService {

    private final RestTemplate restTemplate = new RestTemplate();

    public IndexCategoryResponse getPrice(String token) {
        String url = "https://openapi.koreainvestment.com:9443/uapi/domestic-stock/v1/quotations/inquire-daily-itemchartprice";

        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", "Bearer " + token);
        headers.set("appkey", "PSD64gaxdXbILn8ad7LYQrKHujTVxlydAKiq");
        headers.set("appsecret", "yHvyGFQiCbdmY8CXLe62/48/pID3JKOC7/4ElbdqnARCcDbmRwzB5idQ4HOTLGTEBUQIQN8X3L8xmoxa1jXZn80GXgl9DWZVfqKhxbYYfT6Nbnhvxdc4z9YW9/x6RCMWFEvZGwrFU/zoCJjA/21S/VCgbJ/P7mRPlbIADfFZx6b6kkTNvCE=");
        headers.set("tr_id", "FHKST03010100"); // 모의투자용 TR ID

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("FID_COND_MRKT_DIV_CODE", "J")
                .queryParam("FID_INPUT_ISCD", "005930") // 코스피
                .queryParam("FID_INPUT_DATE_1", "20240521")
                .queryParam("FID_INPUT_DATE_2", "20250520")
                .queryParam("FID_PERIOD_DIV_CODE", "D")
                .queryParam("FID_ORG_ADJ_PRC", "1");

        HttpEntity<?> entity = new HttpEntity<>(headers);

        ResponseEntity<IndexCategoryResponse> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                IndexCategoryResponse.class
        );

        return response.getBody();
    }
}

