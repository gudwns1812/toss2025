package collection.link;

public class MyLinkedListV2 {

    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node newNode = new Node(o);
        if (first == null) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(size - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    public void add(int index, Object o) {
        Node newNode = new Node(o);
        if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else {
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object o) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = o;
        return oldValue;
    }

    //코드 추가
    public Object remove(int index) {
        Node removedNode = getNode(index);
        Object item = removedNode.item;
        if (index == 0) {
            first = first.next;
        } else {
            Node prev = getNode(index - 1);
            prev.next = removedNode.next;
        }
        removedNode.next = null;
        removedNode.item = null;
        size--;
        return item;
    }

    private Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index = 0;
        for (Node x = first; x != null; x = x.next) {
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

    public Object get(int index) {
        return getNode(index).item;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
