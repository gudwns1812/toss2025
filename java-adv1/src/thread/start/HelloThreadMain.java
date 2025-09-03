package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start(); // start() method internally calls run() method in a new thread
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");

        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
