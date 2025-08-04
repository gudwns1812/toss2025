package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        System.out.print("월을 입력하세요 (1-12): ");
        int month = scanner.nextInt();
        scanner.close();
        printCalendar(year, month);
    }

    private static void printCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        LocalDate endOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("endOfMonth = " + endOfMonth);
        System.out.println("endOfMonth.getDayOfMonth() = " + endOfMonth.getDayOfMonth());
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // 1월 1일의 요일을 구하기
        // 1일이 시작하는 요일에 맞춰 공백 출력
        for (int i = 0; i < date.getDayOfWeek().getValue() % 7; i++) {
            System.out.print("    "); // 공백 출력
        }
        for (int i = 1; i <= endOfMonth.getDayOfMonth(); i++) {
            System.out.printf("%3d ", i); // 날짜 출력
            // 요일이 토요일이면 줄바꿈
            if ((date.getDayOfWeek().getValue() + i) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
