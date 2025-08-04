package time.test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {
    public static void main(String[] args) {
        ZonedDateTime dt = LocalDateTime.of(2024, 1, 1, 9, 0, 0)
                .atZone(ZoneId.of("Asia/Seoul"))
                .withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("dt = " + dt);

        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 9, 0, 0), ZoneId.of("Asia/Seoul"))
                .withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("zdt = " + zdt);
    }
}
