package chat.v1;


import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class Client {

    private final String host;
    private static final int PORT = 12345;
    private Socket socket;
    private MessageSender sender;
    private MessageReader reader;
    private String name;

    public Client(String host) {
        this.host = host;
    }


    public void start() throws IOException {
        socket = new Socket("localhost", PORT);
        new Thread(new MessageSender(socket)).start();
        new Thread(new MessageReader(socket)).start();
    }

    private void setName(String s) {
        name = s;
    }

    public void close() {
        try {
            sender.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            log("Client close error: " + e.getMessage());
        }
    }
}
