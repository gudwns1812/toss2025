package collection.set;

public interface MySet<E> {
    boolean add(E element);
    boolean contains(E value);
    boolean remove(E value);
    int size();
}
