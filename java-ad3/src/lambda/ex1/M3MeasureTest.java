package lambda.ex1;

import lambda.Procedure;

import java.util.Arrays;

public class M3MeasureTest {

    static void measure(Procedure p) {
        long start = System.nanoTime();
        p.run();
        long end = System.nanoTime();
        System.out.println("실행 시간: " + (end - start) + "ns");
    }

    public static void main(String[] args) {
        measure(new Procedure() {

            @Override
            public void run() {
                int N = 100;
                long sum = 0;
                for (int i = 1; i <= N; i++) {
                    sum += i;
                }
                System.out.println("[1부터 " + N + "까지의 합] 결과: " + sum);
            }
        });

        measure(new Procedure() {

            @Override
            public void run() {
                int[] arr = { 4, 3, 2, 1 };
                System.out.println("원본 배열: " + Arrays.toString(arr));
                Arrays.sort(arr);
                System.out.println("배열 정렬: " + Arrays.toString(arr));
            }
        });
    }
}
