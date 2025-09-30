package chat.v2.server;

import java.io.IOException;

public class ServerMain {

    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        SessionManager sessionManager = new SessionManager();

        // CommandManager 점진적으로 변경 예정
//        CommandManager commandManagerV1 = new CommandManagerV1(sessionManager);
//        CommandManager commandManagerV1 = new CommandManagerV2(sessionManager);
//        CommandManager commandManagerV1 = new CommandManagerV3(sessionManager); //커멘드 패턴
        CommandManager commandManagerV1 = new CommandManagerV4(sessionManager); //커멘드 패턴

        Server server = new Server(PORT, commandManagerV1, sessionManager);
        server.start();
    }
}
