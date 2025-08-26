package collection.list;

public class MyListPerformanceTest {
    public static void main(String[] args) {
        int size = 100_000;
        System.out.println("MyArrayList 테스트");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);

        MyArrayList<Integer> arrayList = new MyArrayList<>(size); //조회용 데이터
        addLast(arrayList, size);

        int loop = 10_000;
        System.out.println("==조회 성능 테스트==");
        getIndex(arrayList, loop, 0); //앞
        getIndex(arrayList, loop, size/2); //중간
        getIndex(arrayList, loop, size-1); //끝

        System.out.println("MyArrayList 검색");
        search(arrayList, loop, 0); //없는 값
        search(arrayList, loop, size/2); //중간
        search(arrayList, loop, size-1); //끝

        System.out.println("MyLinkedList 테스트");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);

        System.out.println("==조회 성능 테스트==");
        getIndex(linkedList, loop, 0); //앞
        getIndex(linkedList, loop, size/2); //중간
        getIndex(linkedList, loop, size-1); //끝

        System.out.println("MyLinkedList 검색");
        search(linkedList, loop, 0); //없는 값
        search(linkedList, loop, size/2); //중간
        search(linkedList, loop, size-1); //끝

    }

    private static void search(MyList<Integer> list, int loop, int i) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < loop; j++) {
            list.indexOf(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("index: "+ i + ", 반복" + loop + ", search 시간 = " + (end - start) + "ms");
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("크기: "+ size +", addFirst 시간 = " + (end - start) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("크기: "+ size +", addFirst 시간 = " + (end - start) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("크기: "+ size +", addFirst 시간 = " + (end - start) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop , int index) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long end = System.currentTimeMillis();
        System.out.println("index: "+ index + ", 반복" + loop + ", getIndex 시간 = " + (end - start) + "ms");
    }
}
