package lambda.ex3;

import lambda.ex2.StringFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExampleEx2 {

    static List<String> map(List<String> list, UnaryOperator<String> func) {
        List<String> result = new ArrayList<>();
        for (String str : list) {
            result.add(func.apply(str));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of("hello", "java", "lambda");
        System.out.println("원본 리스트: " + words);

        List<String> result1 = map(words, word -> word.toUpperCase());
        System.out.println("원본 리스트: " + words);
        System.out.println("대문자 변환 결과: " + result1);
        List<String> result2 = map(words, word -> "***" + word + "***");
        System.out.println("특수문자 변환 결과: " + result2);
    }
}
