package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");
        Thread thread1 = new Thread(() -> log("run()"));
        thread1.start();
        log("main() end");
    }

}
