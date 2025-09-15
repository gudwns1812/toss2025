package thread.cas.simple.list;

import java.util.Arrays;

import static util.ThreadUtils.sleep;

public class SyncList implements SimpleList {

    private  static final int DEFAULT_CAPACITY = 5;
    private int size = 0;
    private Object[] elements;

    public SyncList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public synchronized int size() {
        return 0;
    }

    @Override
    public synchronized void add(Object o) {
        elements[size] = o;
        sleep(100);
        size++;
    }

    @Override
    public synchronized Object get(int index) {
        return null;
    }

    @Override
    public synchronized String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size)) + " size = " + size + ", capacity = " + elements.length;
    }
}
