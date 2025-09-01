package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //추가
        System.out.println("for-each 사용");
        for (int num : myArray) {
            System.out.println(num);
        }
    }
}
