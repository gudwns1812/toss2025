package collection.array;

import java.util.Arrays;

public class MyArrayListV1 {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayListV1() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListV1(int capacity) {
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public void add(Object o) {
        //코드 추가
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = o;
        size++;
    }

    private void grow() {
        int newCapacity = elementData.length * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    public Object get(int index) {
        return elementData[index];
    }

    public Object set(int index, Object o) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Object oldValue = get(index);
        elementData[index] = o;
        return oldValue;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1; // Not found
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + " size=" + size
                + ", capacity=" + elementData.length;
    }
}
