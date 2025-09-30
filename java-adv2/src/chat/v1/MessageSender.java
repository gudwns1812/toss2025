package chat.v1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static util.MyLogger.log;

public class MessageSender implements Runnable {

    private final DataOutputStream output;
    private static final String DELIMITER = "|";

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("이름을 입력하세요: ");
            output.writeUTF("/join" + DELIMITER + scanner.nextLine());
            while (true) {
                String msg = scanner.nextLine();
                if (msg.equals("/exit")) {
                    break;
                } else if (msg.startsWith("/")) {
                    output.writeUTF(msg);
                } else {
                    output.writeUTF("/message" +DELIMITER + msg);
                }
            }
        } catch (IOException e) {
            log(e);
        } finally {
            close();
        }

    }

    public MessageSender(Socket socket) throws IOException {
        output = new DataOutputStream(socket.getOutputStream());
    }

    public synchronized void close() {
        try {
            output.close();
        } catch (IOException e) {
            log(e);
        }
    }
}
