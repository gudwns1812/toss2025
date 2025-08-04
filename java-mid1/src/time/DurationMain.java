package time;

import java.time.Duration;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println("30분의 Duration: " + duration);

        LocalTime lt = LocalTime.of(1, 0);
        System.out.println("lt = " + lt);

        LocalTime plusTime = lt.plus(duration);
        System.out.println("lt에 30분을 더한 시간: " + plusTime);

        LocalTime startTime = LocalTime.of(9, 0);
        LocalTime endTime = LocalTime.of(10, 30);
        Duration between = Duration.between(startTime, endTime);
        System.out.println("startTime과 endTime 사이의 Duration: " + between.getSeconds());
        System.out.println("startTime과 endTime 사이의 Duration(분): " + between.toMinutesPart());
        System.out.println("startTime과 endTime 사이의 Duration(시간): " + between.toHours());
    }
}
