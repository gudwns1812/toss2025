package collection.iterable;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.iterator());
        forEach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll(set.iterator());

    }

    private static void printAll(Iterator<Integer> iter) {
        System.out.println("iter.getClass() = " + iter.getClass());
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    private static void forEach(Iterable<Integer> iterable) {
        System.out.println("iterable.getClass() = " + iterable.getClass());
        for (Integer num : iterable) {
            System.out.println(num);
        }
    }

}