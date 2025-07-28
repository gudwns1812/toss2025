package lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        //기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a -> b는 a의 값을 복사한 것이다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20; // b의 값을 변경한다.
        System.out.println("a = " + a); // a는 여전히 10이다.
        System.out.println("b = " + b); // b는 이제 20이다.

    }
}
