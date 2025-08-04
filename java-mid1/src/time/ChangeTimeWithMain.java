package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);

        LocalDateTime changeDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("dt의 연도를 2020으로 변경 = " + changeDt1);

        LocalDateTime localDateTime = dt.withYear(2020);
        System.out.println("dt의 연도를 2020으로 변경(편의 메서드) = " + localDateTime);

        //TemporalAdjusters를 사용한 예시
        //다음주 금요일
        LocalDate with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).toLocalDate();
        System.out.println("기준 날짜 : "+ dt);
        System.out.println("다음주 금요일 = " + with1);

        //이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("이번 달의 마지막 일요일 = " + with2);

    }
}
