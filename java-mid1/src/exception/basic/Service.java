package exception.basic;

public class Service {
    Client client = new Client();

    /**
     * 예외를 처리하는 코드
     */
    public void callCatch() {
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("[예외 처리] 예외 메시지: " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }
    /**
     * 예외를 던지는 코드
     */
    public void callThrow() throws MyCheckedException {
        client.call();
        System.out.println("정상 흐름");
    }
}
