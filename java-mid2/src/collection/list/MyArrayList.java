package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        elementData = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E o) {
        if (size == elementData.length) {
            grow();
        }

        elementData[size] = o;
        size++;
    }
    @Override
    public void add(int index, E o) {
        if (size == elementData.length) {
            grow();
        }
        // Shift elements to the right
        shiftRightFrom(index);
        elementData[index] = o;
        size++;
    }

    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
    }

    private void grow() {
        int newCapacity = elementData.length * 2;

        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    @Override
    public E get(int index) {
        return (E) elementData[index];
    }

    @Override
    public E set(int index, E o) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        E oldValue = get(index);
        elementData[index] = o;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        E oldValue = get(index);
        // Shift elements to the left
        shiftLeftFrom(index);
        size--;
        elementData[size] = null; // Clear the last element
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    @Override
    public int indexOf(E o) {
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
