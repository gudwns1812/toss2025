package collection.link;

public class MyLinkedListV3<E> {

    private Node<E> first;
    private int size = 0;

    public void add(E o) {
        Node<E> newNode = new Node<>(o);
        if (first == null) {
            newNode.next = null;
            first = newNode;
        } else {
            Node<E> prev = getNode(size - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public void add(int index, E o) {
        Node<E> newNode = new Node<>(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node<E> prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public E set(int index, E o) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = o;
        return oldValue;
    }

    //코드 추가
    public E remove(int index) {
        Node<E> removedNode = getNode(index);
        E item = removedNode.item;
        if (index == 0) {
            first = first.next;
        } else {
            Node<E> prev = getNode(index - 1);
            prev.next = removedNode.next;
        }
        removedNode.next = null;
        removedNode.item = null;
        size--;
        return item;
    }

    private Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }



    public int indexOf(E o) {
        int index = 0;
        for (Node<E> x = first; x != null; x = x.next) {
            if (x.item.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    public E get(int index) {
        return getNode(index).item;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> current = this;
            sb.append("[");
            while (current != null) {
                sb.append(current.item);
                if (current.next != null) {
                    sb.append(" -> ");
                }
                current = current.next;

            }
            sb.append("]");
            return sb.toString();
        }
    }
}
