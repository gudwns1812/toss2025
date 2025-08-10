package nested.nested.anonymous.ex0;

import java.util.Random;

public class Ex1RefMainV5 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        hello(() -> {
            int num = new Random().nextInt(6) + 1;
            System.out.println("주사위 눈: " + num);
        });
        hello(() -> {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}
