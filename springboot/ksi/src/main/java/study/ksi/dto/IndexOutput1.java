package study.ksi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IndexOutput1 {
    @JsonProperty("bstp_nmix_prpr")
    private String currentPrice;

    @JsonProperty("bstp_nmix_prdy_vrss")
    private String priceChange;

    @JsonProperty("prdy_vrss_sign")
    private String changeSign;

    @JsonProperty("bstp_nmix_prdy_ctrt")
    private String changeRate;

    @JsonProperty("acml_vol")
    private String accumulatedVolume;

    @JsonProperty("acml_tr_pbmn")
    private String accumulatedAmount;

    @JsonProperty("bstp_nmix_oprc")
    private String openPrice;

    @JsonProperty("bstp_nmix_hgpr")
    private String highPrice;

    @JsonProperty("bstp_nmix_lwpr")
    private String lowPrice;

    @JsonProperty("prdy_vol")
    private String prevVolume;

    @JsonProperty("ascn_issu_cnt")
    private String riseCount;

    @JsonProperty("down_issu_cnt")
    private String fallCount;

    @JsonProperty("stnr_issu_cnt")
    private String steadyCount;

    @JsonProperty("uplm_issu_cnt")
    private String upperLimitCount;

    @JsonProperty("lslm_issu_cnt")
    private String lowerLimitCount;

    @JsonProperty("prdy_tr_pbmn")
    private String prevAmount;

    @JsonProperty("dryy_bstp_nmix_hgpr_date")
    private String yearHighDate;

    @JsonProperty("dryy_bstp_nmix_hgpr")
    private String yearHigh;

    @JsonProperty("dryy_bstp_nmix_lwpr")
    private String yearLow;

    @JsonProperty("dryy_bstp_nmix_lwpr_date")
    private String yearLowDate;
}
