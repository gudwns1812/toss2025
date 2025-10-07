package lambda.ex3;

import lambda.ex2.MyReducer;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceExampleEx2 {

    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, BinaryOperator<Integer> reducer) {
        // 코드 작성
        Integer result = initial;
        for (Integer i : list) {
            result = reducer.apply(result, i);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        System.out.println("리스트: " + numbers);

        int result1 = reduce(numbers, 0, (a, b) -> a + b);
        System.out.println("합(누적 +): " + result1);
        int result2 = reduce(numbers, 1, (a, b) -> a * b);
        System.out.println("곱(누적 *): " + result2);
    }
}
