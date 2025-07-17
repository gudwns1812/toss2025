package study.ksi.dto;

import lombok.Data;

@Data
public class KsiRequestDto {
    private String grant_type = "client_credentials";
    private String appkey;
    private String appsecret;
}
