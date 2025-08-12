package exception.basic.unchecked;

public class Service {
    public void call() {
        Client client = new Client();
        client.call();
    }

    public void callCatch() {
        try {
            call();
        } catch (MyUncheckedException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }
}
