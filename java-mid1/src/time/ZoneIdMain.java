package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println("사용 가능한 시간대 목록:");
        for (String zoneId : availableZoneIds) {
            System.out.println(zoneId);
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("시스템 기본 시간대: " + zoneId);
        ZoneId zoneId1 = ZoneId.of("Asia/Seoul");
        System.out.println("지정한 시간대: " + zoneId1);
    }
}
