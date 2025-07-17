package study.ksi.controller;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import study.ksi.dto.IndexCategoryResponse;
import study.ksi.dto.IndexItemDto;
import study.ksi.dto.IndexOutput1;
import study.ksi.dto.IndexOutput2;
import study.ksi.service.KISStockService;
import study.ksi.service.KsiService;

@Component
@RequiredArgsConstructor
public class ksirunner {
    private final KsiService ksiService;
    private final KISStockService kisStockService;

    @Value("${kis.appkey}")
    private String appKey;

    @Value("${kis.appsecret}")
    private String appSecret;

    @PostConstruct
    public void run() {
        try {
            String token = ksiService.getAccessToken(appKey, appSecret);
            IndexCategoryResponse result = kisStockService.getPrice(token);

//            // 🔹 전체 업종 요약 출력 (output1)
//            IndexOutput1 summary = result.getOutput1();
//            if (summary != null) {
//                System.out.println("✅ 전체 업종 지수 요약:");
//                System.out.printf("📊 지수(result1): %sp (%s%%), 등락: %s\n\n",
//                        summary.getCurrentPrice(),
//                        summary.getChangeRate(),
//                        summary.getPriceChange()
//                );
//            }

            // 🔹 업종 내 종목별 지수 출력 (output2)
            System.out.println("📦 업종 내 주요 종목 리스트:");
            if (result.getOutput2() != null) {
                for (IndexOutput2 item : result.getOutput2()) {
                    System.out.printf("  • 날짜: %s | 현재가: %7sp\n",
                            item.getStck_bsop_date(),
                            item.getStck_clpr()
                    );
                }
                System.out.println("  • 총 종목 수: " + result.getOutput2().size());
            } else {
                System.out.println("❌ output2 데이터가 없습니다.");
            }

        } catch (Exception e) {
            System.err.println("❌ 실행 중 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
