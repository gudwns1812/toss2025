package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(2013, 3, 15);
        System.out.println("현재 날짜: " + nowDate);
        System.out.println("지정 날짜: " + localDate);

        //계산(불변)
        LocalDate localDate1 = localDate.plusDays(10);// 10일 후
        System.out.println("지정날짜 + 10D = " + localDate1);
    }
}
