package lambda.lambda3;

public class GenericMain1 {
    public static void main(String[] args) {
        StringFunction upperCase = s -> s.toUpperCase();
        String result1 = upperCase.apply("hello");



    }

    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        int apply(Integer n);
    }
}
