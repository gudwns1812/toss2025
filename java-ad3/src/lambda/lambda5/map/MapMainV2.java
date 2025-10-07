package lambda.lambda5.map;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class MapMainV2 {

    public static void main(String[] args) {
        List<String> list = List.of("1", "12", "123", "1234");

        //문자열을 숫자로 변환
        List<Integer> numbers = map(list , x -> Integer.valueOf(x));
        System.out.println("numbers = " + numbers);

        //문자열의 길이
        List<Integer> length = map(list , x -> x.length());
        System.out.println("length = " + length);
    }

    private static List<Integer> map(List<String> list , Function<String, Integer> mapper) {
        List<Integer> numbers = new ArrayList<>();
        for (String s : list) {
            numbers.add(mapper.apply(s));
        }
        return numbers;
    }
}
