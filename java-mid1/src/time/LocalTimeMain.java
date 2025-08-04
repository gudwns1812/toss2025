package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime localTime = LocalTime.of(9, 30, 0);// 9시 30분 0초

        System.out.println("현재 시간: " + nowTime);
        System.out.println("지정 시간: " + localTime);

        // 계산(불변)
        LocalTime localTime1 = localTime.plusHours(2); // 2시간 후
        System.out.println("지정시간 + 2H = " + localTime1);
    }
}
