package collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

    public static void main(String[] args) {
        Integer[] integerArray = {30, 20, 20, 10, 40};
        Set<Integer> integerSet = new LinkedHashSet<>(List.of(integerArray));
        for (Integer i : integerSet) {
            System.out.println(i);
        }
    }
}
