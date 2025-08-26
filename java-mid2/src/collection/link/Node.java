package collection.link;

public class Node {

    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    /*
    ide 생성
    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }*/

    // [A -> B -> C]
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = this;
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
