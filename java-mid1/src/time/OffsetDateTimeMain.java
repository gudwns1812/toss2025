package time;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Random;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime now = OffsetDateTime.now();
        System.out.println("현재 OffsetDateTime: " + now);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(2030, 1, 1, 13, 30, 50, 0, ZoneOffset.of("+01:00"));
        System.out.println("지정한 OffsetDateTime: " + offsetDateTime);
    }
}
