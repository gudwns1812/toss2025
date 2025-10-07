package lambda.lambda3;

public class GenericMain6 {
    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = str -> str.toUpperCase();
        GenericFunction<String, Integer> stringLength = str -> str.length();
        GenericFunction<Integer, Integer> squre = x -> x * x;
        GenericFunction<Integer, Boolean> isEven = x -> x % 2 == 0;

        System.out.println(toUpperCase.apply("Hello"));
        System.out.println(stringLength.apply("Hello"));
        System.out.println(squre.apply(3));
        System.out.println(isEven.apply(3));

    }

    @FunctionalInterface
    interface GenericFunction<T,R> {
        R apply(T s);
    }

}
