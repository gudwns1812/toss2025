package collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("연결된 노드 출력하기");
        System.out.println(first);

        //모든 노드 출력하기
        System.out.println("모든 노드 탐색");
        printAll(first);

        //마지막 노드 출력하기
        Node lastNode = getLastNode(first);
        System.out.println("lastNode = " + lastNode);

        //특전 index의 노드 출력하기
        int index = 2;
        Node index2Node = getNode(first, index);
        System.out.println("index2Node = " + index2Node.item);

        //데이터 추가하기
        System.out.println("데이터 추가하기");
        add(first, "D");
        System.out.println(first);
    }



    private static void printAll(Node first) {
        Node x = first;
        while (x != null) {
            System.out.println("x.item = " + x.item);
            x = x.next;
        }
    }

    private static Node getLastNode(Node first) {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static Node getNode(Node first, int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private static void add(Node first, String d) {
        getLastNode(first).next = new Node(d);
    }
}
