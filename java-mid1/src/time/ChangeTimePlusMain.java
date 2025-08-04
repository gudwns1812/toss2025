package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime plus = dt.plus(10, ChronoUnit.YEARS);
        System.out.println("10년 후 dt = " + plus);

        LocalDateTime plus2 = dt.plusYears(10);
        System.out.println("10년 후 dt(편의 메서드) = " + plus2);

        Period period = Period.ofYears(10);
        LocalDateTime plus3 = dt.plus(period);
        System.out.println("10년 후 dt(Period) = " + plus3);
    }
}
