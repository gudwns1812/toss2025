package lambda.lambda3;

public class GenericMain2 {
    public static void main(String[] args) {
        ObjectFunction upperCase = s ->s.toString().toUpperCase();
        String result1 =(String) upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        ObjectFunction square = n ->(Integer) n* (Integer) n;
        Object apply = square.apply(9);
        System.out.println("apply = " + apply);

    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
