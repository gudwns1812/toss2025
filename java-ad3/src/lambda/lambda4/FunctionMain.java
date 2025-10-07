package lambda.lambda4;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        //익명 클래스
        Function<String, Integer> function1 = new Function<>() {

            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };
        System.out.println("function1 = " + function1.apply("hello"));
        Function<String, Integer> function2 = str -> str.length();
        System.out.println("function2 = " + function2.apply("hello"));
    }
}
