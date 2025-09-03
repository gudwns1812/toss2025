package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        };
        Thread thread1 = new Thread(myRunnable);
        thread1.start();
        log("main() end");
    }

}
