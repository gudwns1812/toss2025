package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV3 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);

        Thread thread1 = new Thread(sumTask1);
        Thread thread2 = new Thread(sumTask2);

        thread1.start();
        thread2.start();

        // 스레드가 종료될 때까지 대기
        log("join()  - main 스레드가 thread1, thread2 스레드가 종료될 때까지 기다림");
        thread1.join();
        thread2.join();
        log("main 스레드 대기 완료");

        int sumAll = sumTask1.result + sumTask2.result;
        log("task1 + task2 = " + sumAll);
        log("end");

    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            for (int i = startValue; i <= endValue; i++) {
                result += i;
            }
            log("result = " + result);
            log("작업 완료");
        }
    }
}
