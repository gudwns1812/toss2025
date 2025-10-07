package lambda.lambda3;

public class GenericMain3 {
    public static void main(String[] args) {
        ObjectFunction upperCase = new ObjectFunction() {
            @Override
            public Object apply(Object s) {
                return s.toString().toUpperCase();
            }
        };
        String result1 =(String) upperCase.apply("hello");
        System.out.println("result1 = " + result1);

        ObjectFunction square = new ObjectFunction() {
            @Override
            public Object apply(Object n) {
                return (Integer) n * (Integer) n;
            }
        };
        Object apply = square.apply(9);
        System.out.println("apply = " + apply);

    }

    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}
