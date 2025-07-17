package study.ksi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IndexOutput2 {
    @JsonProperty("stck_bsop_date")
    private String stck_bsop_date; // 기준일자

    @JsonProperty("stck_clpr")
    private String stck_clpr; // 종가
}
