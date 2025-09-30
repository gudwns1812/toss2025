package chat.v1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

import static util.MyLogger.log;

public class MessageReader implements Runnable {
    
    private final DataInputStream input;


    public MessageReader(Socket socket) throws IOException {
        input = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        try {
            while (true) {
                String received = input.readUTF();
                System.out.println(received);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            close();
        }
    }

    public void readMessage() throws IOException {
        log(input.readUTF());
    }

    public synchronized void close(){
        try {
            input.close();
        } catch (IOException e) {
            log(e);
        }
    }
}
