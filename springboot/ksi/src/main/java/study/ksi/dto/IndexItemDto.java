package study.ksi.dto;

import lombok.Data;

@Data
public class IndexItemDto {
    private String idx_indx;  // 업종 코드
    private String idx_nm;    // 업종 이름
    private String clpr;      // 현재가
    private String vs;        // 전일 대비
    private String flt_rt;    // 등락률
}
