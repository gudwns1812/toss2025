package network.tcp.autocloseable;

public class ResourceCloseMainV4 {
    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외 처리");

            Throwable[] suppressed = e.getSuppressed();
            for (Throwable throwable : suppressed) {
                System.out.println("suppressed ex: " + throwable);
            }
            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("CloseException 예외 처리");
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CallException, CloseException {
        try (ResourceV2 resouce1 = new ResourceV2("resource1");
             ResourceV2 resouce2 = new ResourceV2("resource2");) {

            resouce1.call();
            resouce2.callEx(); //CallException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        }
    }
}
