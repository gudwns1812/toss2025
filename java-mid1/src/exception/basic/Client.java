package exception.basic;

public class Client {
    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }
}
