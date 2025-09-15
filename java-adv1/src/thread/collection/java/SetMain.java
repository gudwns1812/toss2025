package thread.collection.java;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> copySet = new CopyOnWriteArraySet<>();
        copySet.add(1);
        copySet.add(2);
        copySet.add(3);

        System.out.println("copySet = " + copySet);

        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();
        concurrentSkipListSet.add(3);
        concurrentSkipListSet.add(2);
        concurrentSkipListSet.add(1);

        System.out.println("concurrentSkipListSet = " + concurrentSkipListSet);
    }
}
