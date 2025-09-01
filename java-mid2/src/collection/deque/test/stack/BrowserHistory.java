package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    private final Deque<String> history = new ArrayDeque<>();

    public void visitPage(String url) {
        System.out.println("방문: " + url);
        history.push(url);
    }

    public String goBack() {
        if (!history.isEmpty()) {
            String pop = history.pop();
            System.out.println("뒤로가기 : " + pop);
            return pop;
        }
        return null;
    }
}
