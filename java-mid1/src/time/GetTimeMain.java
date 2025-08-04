package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

import static java.time.temporal.ChronoField.*;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println("Year = " + dt.get(YEAR));
        System.out.println("Month = " + dt.get(MONTH_OF_YEAR));
        System.out.println("Day of Month = " + dt.get(DAY_OF_MONTH));
        System.out.println("Hour of Day = " + dt.get(HOUR_OF_DAY));
        System.out.println("Minute of Hour = " + dt.get(MINUTE_OF_HOUR));
        System.out.println("Second of Minute = " + dt.get(SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println("Year = " + dt.getYear());
        System.out.println("Month = " + dt.getMonthValue());
        System.out.println("Day of Month = " + dt.getDayOfMonth());
        System.out.println("Hour of Day = " + dt.getHour());
        System.out.println("Minute of Hour = " + dt.getMinute());
        System.out.println("Second of Minute = " + dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = " + dt.get(MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dt.get(SECOND_OF_DAY));

    }
}
