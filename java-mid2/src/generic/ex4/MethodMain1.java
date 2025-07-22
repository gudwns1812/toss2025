package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("명시적 타입 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        System.out.println("result = " + result);

        // 타입 추론
        GenericMethod.numberMethod(20.5);
    }
}
