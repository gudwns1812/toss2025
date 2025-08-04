package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        boolean supported = today.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int second = today.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("LocalDate의 초: " + second);
        } else {
            System.out.println("LocalDate는 초를 지원하지 않습니다.");
        }
    }
}
