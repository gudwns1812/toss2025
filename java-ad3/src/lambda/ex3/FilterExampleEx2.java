package lambda.ex3;

import lambda.ex2.MyPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleEx2 {

    static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : list) {
            if (predicate.test(i)) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(-3, -2, -1, 1, 2, 3, 5);
        List<Integer> result1 = filter(list, new Predicate<>() {
            @Override
            public boolean test(Integer value) {
                return value < 0;
            }
        });
        System.out.println("원본 리스트: " + list);
        System.out.println("음수만: " + result1);
        List<Integer> result2 = filter(list, value -> value % 2 == 0);
        System.out.println("짝수만: " + result2);
    }
}
