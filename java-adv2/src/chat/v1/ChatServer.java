package chat.v1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

public class ChatServer {

    private static final int PORT = 12345;
    private ServerSocket serverSocket;
    private SessionManager manager;

    public ChatServer(SessionManager manager) {
        this.manager = manager;
    }

    public void start(){
        try {
            serverSocket = new ServerSocket(PORT);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(new Session(socket , manager)).start();
            }

        } catch (IOException e) {
            log(e);
        } finally {
            shutdown();
        }
    }

    private void shutdown() {
        try {
            manager.closeAll();
            serverSocket.close();
        } catch (IOException e) {
            log(e);
        }
    }


}
