package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
//        Random rand = new Random();
        Random rand = new Random(1); // 시드값을 현재 시간으로 설정

        int i = rand.nextInt();
        System.out.println("i = " + i);

        double v = rand.nextDouble();
        System.out.println("v = " + v);

        boolean b = rand.nextBoolean();
        System.out.println("b = " + b);

        //범위 조회
        int randomRange1 = rand.nextInt(10);// 0 ~ 9
        System.out.println("randomRange1 = " + randomRange1);

        int randomRange2 = rand.nextInt(10) + 1; // 1 ~ 10
        System.out.println("randomRange2 = " + randomRange2);
    }
}
