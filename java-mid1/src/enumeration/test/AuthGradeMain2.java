package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("등급을 입력하세요 (GUEST, LOGIN, ADMIN): ");
        String input = scanner.nextLine().toUpperCase();

        try {
            AuthGrade authGrade = AuthGrade.valueOf(input);
            System.out.println("입력한 등급: " + authGrade.name());
            System.out.println("레벨: " + authGrade.getLevel());
            System.out.println("설명: " + authGrade.getDescription());
        } catch (IllegalArgumentException e) {
            System.out.println("잘못된 등급입니다. BASIC, GOLD, DIAMOND 중 하나를 입력하세요.");
        } finally {
            scanner.close();
        }
    }
}
