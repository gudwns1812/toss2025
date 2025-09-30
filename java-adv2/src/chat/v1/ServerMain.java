package chat.v1;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerMain {
    public static void main(String[] args) throws IOException {
        SessionManager sessionManager = new SessionManager();
        ChatServer server = new ChatServer(sessionManager);
        server.start();
    }
}
