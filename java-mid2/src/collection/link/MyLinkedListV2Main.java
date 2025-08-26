package collection.link;

public class MyLinkedListV2Main {
    public static void main(String[] args) {
        MyLinkedListV2 list = new MyLinkedListV2();
        // 마지막에 추가 O(n)
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list = " + list);

        // 첫번쨰 노드에 추가 O(1)
        System.out.println("== 첫번째 노드에 추가 ==");
        list.add(0, "d");
        System.out.println(list);

        System.out.println("첫 번째 노드 삭제");
        list.remove(0);
        System.out.println(list);

        System.out.println("중간 노드 추가");
        list.add(1, "e");
        System.out.println(list);

        System.out.println("중간 노드 삭제");
        list.remove(1);
        System.out.println(list);

    }
}
