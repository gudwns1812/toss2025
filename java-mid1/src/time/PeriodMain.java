package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println("10일 기간: " + period);

        // Period를 사용하여 날짜 계산
        LocalDate today = LocalDate.of(2030,1,1);
        Period period2 = Period.of(1, 2, 3); // 1년, 2개월, 3일
        LocalDate plusDate = today.plus(period);
        System.out.println("plusDate = " + plusDate);

        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        Period between = Period.between(startDate, endDate);
        System.out.println("startDate와 endDate 사이의 기간: " + between);

    }
}
