package thread.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("A", 10000) , "Thread-A");
        threadA.start();
        Thread threadB = new Thread(new PrintWork("B", 5000) , "Thread-B");
        threadB.start();
    }

    static class PrintWork implements Runnable {

        private final String content;
        private final int Delay;

        public PrintWork(String content, int delay) {
            this.content = content;
            Delay = delay;
        }

        public void print() {
            try {
                for (int i = 0; i < 5; i++) {
                    log(content);
                    Thread.sleep(Delay);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void run() {
            print();
        }
    }
}