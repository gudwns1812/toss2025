package study.ksi.dto;

import lombok.Data;

@Data
public class KISTokenResponse {
    private String access_token;
    private String token_type;
    private int expires_in;
}
