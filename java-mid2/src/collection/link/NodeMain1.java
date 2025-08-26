package collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        Node current = first;
        while (current != null) {
            System.out.println("current.item = " + current.item);
            current = current.next;
        }
    }
}
