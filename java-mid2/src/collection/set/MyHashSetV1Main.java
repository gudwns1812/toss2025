package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);

        System.out.println(set);

        boolean result = set.add(4);// 중복된 값 추가 시도
        System.out.println("result = " + result);
        System.out.println(set); // 중복된 값이 추가되지 않음

        System.out.println("set.contains(3) = " + set.contains(3));
    }
}
