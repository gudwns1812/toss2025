package lambda.ex2;

import java.util.List;

public class ReduceExample {

    // 함수를 인자로 받아, 리스트 요소를 하나로 축약(reduce)하는 고차 함수
    public static int reduce(List<Integer> list, int initial, MyReducer reducer) {
        // 코드 작성
        int result = initial;
        for (Integer i : list) {
            result = reducer.reduce(result, i);
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
