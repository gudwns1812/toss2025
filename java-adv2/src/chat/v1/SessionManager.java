package chat.v1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SessionManager {

    private List<Session> sessions = new ArrayList<>();

    public void add(Session session) {
        sessions.add(session);
    }

    public void remove(Session session) {
        sessions.remove(session);
    }

    public void sendAll(String message) throws IOException {
        for (Session session : sessions) {
            session.sendMessage(message);
        }
    }

    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        for (Session session : sessions) {
            users.add(session.getUserName());
        }
        return users;
    }

    public void closeAll() throws IOException {
        for (Session session : sessions) {
            session.close();
        }
    }
}
