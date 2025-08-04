package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2013, 3, 15, 10, 30, 0);
        System.out.println("현재 날짜와 시간: " + localDateTime);
        System.out.println("지정 날짜와 시간: " + localDateTime1);

        //날짜와 시간 분리
        LocalDate localDate = localDateTime1.toLocalDate();
        System.out.println("지정 날짜: " + localDate);
        LocalTime localTime = localDateTime1.toLocalTime();
        System.out.println("지정 시간: " + localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);
        System.out.println("지정 날짜와 시간 합체: " + localDateTime2);

        //계산(불변)
        LocalDateTime localDateTime3 = localDateTime1.plusDays(10); // 10일 후
        System.out.println("지정날짜 + 10D = " + localDateTime3);

        //비교
        if (localDateTime.isAfter(localDateTime1)) {
            System.out.println("현재 날짜와 시간이 지정 날짜와 시간보다 이후입니다.");
        } else if (localDateTime.isBefore(localDateTime1)) {
            System.out.println("현재 날짜와 시간이 지정 날짜와 시간보다 이전입니다.");
        } else if (localDateTime.isEqual(localDateTime1)) {
            System.out.println("현재 날짜와 시간이 지정 날짜와 시간과 같습니다.");
        }
    }
}
