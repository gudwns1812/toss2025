package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] integerArray = {30, 20, 20, 10, 40};
        Set<Integer> integerSet = new HashSet<>(Arrays.asList(integerArray));
        System.out.println("integerSet = " + integerSet);
    }
}
