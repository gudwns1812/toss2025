package chat.v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class Session implements Runnable {

    private static final String DELIMITER = "\\|";
    private final Socket socket;
    private final SessionManager manager;
    private final DataInputStream input;
    private final DataOutputStream output;
    private String name;

    public Session(Socket socket , SessionManager manager) throws IOException {
        this.socket = socket;
        this.manager = manager;
        this.input = new DataInputStream(socket.getInputStream());
        this.output = new DataOutputStream(socket.getOutputStream());
        manager.add(this);
    }


    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();
                if (received.startsWith("/join")) {
                    String name = received.split(DELIMITER)[1];
                    setName(name);
                    manager.sendAll(name + "님이 입장하였습니다.");
                } else if (received.startsWith("/message")) {
                    manager.sendAll(name + ": " +received.split(DELIMITER)[1]);
                } else if (received.startsWith("/change")) {
                    setName(received.split(DELIMITER)[1]);
                    output.writeUTF("이름이 변경되었습니다.");
                } else if (received.startsWith("/exit")) {
                    manager.sendAll(name + "님이 퇴장하였습니다.");
                    break;
                }
            }

            manager.remove(this);
            close();

        } catch (IOException e) {
            log(e);
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) throws IOException {
        output.writeUTF(message);
    }

    public String getUserName() {
        return name;
    }

    public void close() throws IOException {
        output.close();
        input.close();
        socket.close();
    }
}
