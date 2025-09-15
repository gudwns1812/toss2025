package thread.cas.simple.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SynchronizedListMain {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.getClass());
        list.sort((o1, o2) -> o1.length() - o2.length());
        System.out.println("list = " + list);
    }
}
