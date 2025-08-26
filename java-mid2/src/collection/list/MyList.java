package collection.list;

public interface MyList<E> {
    int size();
    void add(E o);
    void add(int index, E o);
    E get(int index);
    E set(int index, E o);
    E remove(int index);
    int indexOf(E o);
}
