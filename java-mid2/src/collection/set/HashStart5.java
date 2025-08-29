package collection.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashStart5 {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println(Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9 );

        System.out.println("buckets = " + Arrays.toString(buckets));

        int searchValue = 14;
        boolean contains = contains(buckets, searchValue);
        System.out.println("contains = " + contains);

    }

    private static void add(LinkedList<Integer>[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = inputArray[hashIndex];
        if (!bucket.contains(value)) {
            bucket.add(value);
        }

    }

    private static boolean contains(LinkedList<Integer>[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = inputArray[hashIndex];
        return bucket.contains(value);
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }

}
