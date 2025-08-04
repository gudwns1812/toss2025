package time;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println("현재 Instant: " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("ZonedDateTime에서 Instant로 변환: " + from);

        Instant instant = Instant.ofEpochSecond(100);
        System.out.println("지정한 Instant: " + instant);
    }
}
