package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0)
                .plusYears(1).plusMonths(1).plusHours(4);
        System.out.println("localDateTime = " + localDateTime);

    }
}
