package nested.nested.anonymous.ex0;

public class Ex1RefMainV2 {
    public static void hello(Process process) {
        System.out.println("프로그램 시작");
        process.run();
        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        class Dice implements Process {
            @Override
            public void run() {
                int num = (int) (Math.random() * 6) + 1;
                System.out.println("주사위 눈: " + num);
            }
        };
        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        hello(new Dice());
        hello(new Sum());
    }
}
