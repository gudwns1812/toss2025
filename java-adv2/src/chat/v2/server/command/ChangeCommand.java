package chat.v2.server.command;

import chat.v2.server.Session;
import chat.v2.server.SessionManager;

import java.io.IOException;

public class ChangeCommand implements Command {

    private final SessionManager sessionManager;

    public ChangeCommand(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public void execute(String[] args, Session session) throws IOException {

        String changeName = args[1];
        session.setUsername(changeName);
        sessionManager.sendAll(changeName + "님이 " + changeName + "로 이름을 변경했습니다.");
    }
}
