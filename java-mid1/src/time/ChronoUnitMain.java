package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import static java.time.temporal.ChronoUnit.*;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = values();
        for (ChronoUnit value : values) {
            System.out.println("value = " + value);
        }
        System.out.println("hours = " + HOURS);
        System.out.println(HOURS.getDuration().getSeconds());
        System.out.println("Days.duration() = " + DAYS.getDuration().getSeconds());

        LocalTime localTime = LocalTime.of(1, 10, 0);
        LocalTime localTime2 = LocalTime.of(1, 20, 0);

        long between = SECONDS.between(localTime, localTime2);
        System.out.println("localTime과 localTime2 사이의 초: " + between);
    }
}
